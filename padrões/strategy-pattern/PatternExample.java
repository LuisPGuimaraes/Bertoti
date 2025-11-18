import java.math.BigDecimal;
import java.util.Map;

interface PaymentStrategy {
    BigDecimal process(BigDecimal value);
}

class CreditCardStrategy implements PaymentStrategy {
    @Override
    public BigDecimal process(BigDecimal value) {
        BigDecimal fee = value.multiply(new BigDecimal("0.02"));
        return value.add(fee);
    }
}

class PixStrategy implements PaymentStrategy {
    @Override
    public BigDecimal process(BigDecimal value) {
        return value; // Pix sem taxa
    }
}

class CryptoStrategy implements PaymentStrategy {
    @Override
    public BigDecimal process(BigDecimal value) {
        BigDecimal minerFee = new BigDecimal("5.00");
        return value.add(minerFee);
    }
}

class Checkout {
    private PaymentStrategy strategy;

    void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    BigDecimal finishOrder(BigDecimal value) {
        if (strategy == null) {
            throw new IllegalStateException("Defina uma estratégia antes de pagar");
        }
        return strategy.process(value);
    }
}

public class PatternExample {
    public static void main(String[] args) {
        Map<String, PaymentStrategy> strategies = Map.of(
            "credito", new CreditCardStrategy(),
            "pix", new PixStrategy(),
            "cripto", new CryptoStrategy()
        );

        Checkout checkout = new Checkout();
        checkout.setStrategy(strategies.get("credito"));
        System.out.println("Cartão: " + checkout.finishOrder(new BigDecimal("100")));

        checkout.setStrategy(strategies.get("pix"));
        System.out.println("Pix: " + checkout.finishOrder(new BigDecimal("100")));
    }
}
