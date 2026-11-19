public class TaxedSalariedEmployee extends SalariedEmployee {
    private final Taxable tax;
    public TaxedSalariedEmployee(String name, double basePay, Taxable tax) {
        super(name, basePay);
        this.tax = tax;
    }
    @Override
    protected double deductions() {
        return tax.tax(gross());
    }
}
