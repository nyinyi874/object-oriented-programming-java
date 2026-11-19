public class SalariedEmployee extends Employee {
    public SalariedEmployee(String name, double basePay) {
        super(name, basePay);
    }
    @Override
    protected double gross() {
        return basePay;
    }
}
