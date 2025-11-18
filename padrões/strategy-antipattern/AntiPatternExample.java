import java.math.BigDecimal;
import java.time.LocalDate;

class ConditionalPaymentProcessor {
    BigDecimal pay(String method, BigDecimal value) {
        if ("credito".equals(method)) {
            return value.add(value.multiply(new BigDecimal("0.015")));
        }
        if ("pix".equals(method)) {
            return value;
        }
        if ("boleto".equals(method)) {
            boolean weekend = LocalDate.now().getDayOfWeek().getValue() >= 6;
            return weekend ? value.add(new BigDecimal("4.90")) : value.add(new BigDecimal("2.90"));
        }
        throw new IllegalArgumentException("Método não suportado: " + method);
    }
}

public class AntiPatternExample {
    public static void main(String[] args) {
        ConditionalPaymentProcessor processor = new ConditionalPaymentProcessor();
        System.out.println(processor.pay("credito", new BigDecimal("100")));
        System.out.println(processor.pay("boleto", new BigDecimal("100")));
    }
}
