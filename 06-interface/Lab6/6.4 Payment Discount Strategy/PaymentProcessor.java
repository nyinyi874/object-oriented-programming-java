public interface PaymentProcessor {
    boolean charge(double amount);

    default void audit(double amount, boolean ok) {
        System.out.printf("[Audit] charge %.2f -> %s%n", amount, ok ? "OK" : "FAIL");
    }

    static boolean valid(double amount) {
        return amount >= 0.0;
    }

    private String fmt(double v) {
        return String.format("%.2f", v);
    } // Java 9+
}
