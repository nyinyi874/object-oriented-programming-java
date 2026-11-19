public class ProgressiveTax implements Taxable {
    // Simple two-bracket demo: 10% up to 1000, then 20% on the rest
    @Override
    public double tax(double gross) {
        double base = Math.min(1000.0, gross) * 0.10;
        double extra = Math.max(0.0, gross - 1000.0) * 0.20;
        return base + extra;
    }
}
