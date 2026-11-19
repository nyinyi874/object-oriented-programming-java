public class HourlyEmployee extends Employee {
    private final double hours;
    private final double rate;
    public HourlyEmployee(String name, double basePay, double hours, double rate) {
        super(name, basePay);
        this.hours = hours;
        this.rate = rate;
    }
    @Override
    protected double gross() {
        return hours * rate;
    }
}
