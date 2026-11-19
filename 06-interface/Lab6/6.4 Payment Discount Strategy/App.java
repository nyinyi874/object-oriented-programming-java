public class App {
    public static void main(String[] args) {
        PaymentProcessor sandbox = new SandboxProcessor();
        PaymentProcessor failover = new FailoverProcessor(1);

        Discount none = Discount.none();
        Discount promo10 = Discount.percent(0.10);
        Discount threshold = t -> t >= 1000 ? t * 0.9 : t; // lambda

        Checkout checkout = new Checkout(sandbox, none);
        System.out.println("=== Sandbox + no discount ===");
        checkout.process(250);
        checkout.process(1500);

        System.out.println("\n=== Swap discount to 10% ===");
        checkout.setDiscount(promo10);
        checkout.process(200);

        System.out.println("\n=== Swap processor to Failover ===");
        checkout.setProcessor(failover);
        checkout.setDiscount(threshold);
        checkout.process(800);

        System.out.println("\n=== Default method conflict demo ===");
        CombinedLogger logger = new CombinedLogger();
        logger.audit(123.45);
    }
}
