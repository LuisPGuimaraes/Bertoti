import java.util.ArrayList;
import java.util.List;

interface DeliveryStrategy {
    void deliver(String audience, String message);
    String channel();
}

class EmailStrategy implements DeliveryStrategy {
    @Override
    public void deliver(String audience, String message) {
        System.out.println("[EMAIL] Enviando para " + audience + ": " + message);
    }

    @Override
    public String channel() {
        return "EMAIL";
    }
}

class SmsStrategy implements DeliveryStrategy {
    @Override
    public void deliver(String audience, String message) {
        System.out.println("[SMS] -> " + audience + ": " + message);
    }

    @Override
    public String channel() {
        return "SMS";
    }
}

interface DeliveryObserver {
    void onDelivered(String channel, String audience, String message);
}

class AnalyticsListener implements DeliveryObserver {
    @Override
    public void onDelivered(String channel, String audience, String message) {
        System.out.println("[Analytics] " + channel + " entregue para " + audience);
    }
}

class AuditListener implements DeliveryObserver {
    @Override
    public void onDelivered(String channel, String audience, String message) {
        System.out.println("[Audit] registrando envio para " + audience + ": " + message);
    }
}

abstract class NotificationNode {
    abstract void dispatch(NotificationEngine engine);
}

class NotificationLeaf extends NotificationNode {
    private final String audience;
    private final String message;

    NotificationLeaf(String audience, String message) {
        this.audience = audience;
        this.message = message;
    }

    @Override
    void dispatch(NotificationEngine engine) {
        engine.emit(audience, message);
    }
}

class NotificationGroup extends NotificationNode {
    private final String label;
    private final List<NotificationNode> children = new ArrayList<>();

    NotificationGroup(String label) {
        this.label = label;
    }

    NotificationGroup add(NotificationNode node) {
        children.add(node);
        return this;
    }

    @Override
    void dispatch(NotificationEngine engine) {
        System.out.println("Grupo: " + label);
        children.forEach(child -> child.dispatch(engine));
    }
}

class NotificationEngine {
    private DeliveryStrategy strategy;
    private final List<DeliveryObserver> observers = new ArrayList<>();

    void setStrategy(DeliveryStrategy strategy) {
        this.strategy = strategy;
    }

    void attach(DeliveryObserver observer) {
        observers.add(observer);
    }

    void send(NotificationNode node) {
        if (strategy == null) {
            throw new IllegalStateException("Defina uma estratégia antes de enviar");
        }
        node.dispatch(this);
    }

    void emit(String audience, String message) {
        strategy.deliver(audience, message);
        notifyObservers(strategy.channel(), audience, message);
    }

    private void notifyObservers(String channel, String audience, String message) {
        observers.forEach(observer -> observer.onDelivered(channel, audience, message));
    }
}

public class PatternExample {
    public static void main(String[] args) {
        NotificationGroup campaign = new NotificationGroup("Lançamento")
            .add(new NotificationLeaf("Base VIP", "Preview exclusivo"))
            .add(new NotificationLeaf("Lista geral", "Venda liberada"));

        NotificationEngine engine = new NotificationEngine();
        engine.attach(new AnalyticsListener());
        engine.attach(new AuditListener());

        engine.setStrategy(new EmailStrategy());
        engine.send(campaign);

        engine.setStrategy(new SmsStrategy());
        engine.send(campaign);
    }
}
