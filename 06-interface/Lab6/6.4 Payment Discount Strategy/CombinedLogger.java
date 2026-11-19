public class CombinedLogger implements LogA, LogB {
    @Override public void audit(double amount) {
        LogA.super.audit(amount);
        LogB.super.audit(amount);
    }
}
