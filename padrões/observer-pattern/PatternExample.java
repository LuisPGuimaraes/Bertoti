import java.util.ArrayList;
import java.util.List;

interface StockObserver {
    void update(String ticker, double price);
}

class MobileDisplay implements StockObserver {
    @Override
    public void update(String ticker, double price) {
        System.out.println("[MOBILE] " + ticker + " = " + price);
    }
}

class AuditLog implements StockObserver {
    @Override
    public void update(String ticker, double price) {
        System.out.println("[LOG] Registrando alteração para " + ticker + ": " + price);
    }
}

class StockTicker {
    private final List<StockObserver> observers = new ArrayList<>();
    private double price;

    void attach(StockObserver observer) {
        observers.add(observer);
    }

    void detach(StockObserver observer) {
        observers.remove(observer);
    }

    void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    private void notifyObservers() {
        for (StockObserver observer : observers) {
            observer.update("ACME", price);
        }
    }
}

public class PatternExample {
    public static void main(String[] args) {
        StockTicker ticker = new StockTicker();
        ticker.attach(new MobileDisplay());
        ticker.attach(new AuditLog());

        ticker.setPrice(10.5);
        ticker.setPrice(11.2);
    }
}
