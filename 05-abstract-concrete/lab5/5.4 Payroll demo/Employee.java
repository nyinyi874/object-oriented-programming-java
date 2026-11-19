abstract class Employee {
    private final String name;
    protected final double basePay;

    protected Employee(String name, double basePay) {
        this.name = name;
        this.basePay = basePay;
    }

    public String getName() {
        return name;
    }

    // Template Method: fixed algorithm calling hooks
    public final void printPayslip() {
        double g = gross();
        double d = deductions();
        double net = g - d;
        System.out.printf("%s | gross=%.2f, deductions=%.2f, net=%.2f%n",
                name, g, d, net);
    }

    // Hook: subclasses must implement
    protected abstract double gross();

    // Hook with default: subclasses may override
    protected double deductions() {
        return 0.0;
    }
}
