public class FlatTax implements Taxable {
    private final double rate; // e.g., 0.15 = 15%
    public FlatTax(double rate) { this.rate = rate; }
    @Override
    public double tax(double gross) { return gross * rate; }
}
