import java.util.concurrent.atomic.AtomicInteger;

public class FailoverProcessor implements PaymentProcessor {
    private final int retries;
    private final AtomicInteger attempts = new AtomicInteger(0);

    public FailoverProcessor(int retries) { this.retries = Math.max(0, retries); }

    @Override
    public boolean charge(double amount) {
        // Fail first attempt for >= 500; succeed on subsequent attempts if retries > 0
        int n = attempts.incrementAndGet();
        boolean ok = (amount < 500) || (n > 1 && retries > 0);
        audit(amount, ok);
        return ok;
    }
}
