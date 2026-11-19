public class SandboxProcessor implements PaymentProcessor {
    @Override
    public boolean charge(double amount) {
        boolean ok = PaymentProcessor.valid(amount);
        audit(amount, ok);
        return ok;
    }
}
