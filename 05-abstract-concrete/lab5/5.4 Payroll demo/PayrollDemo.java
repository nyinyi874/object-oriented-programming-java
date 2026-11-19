public class PayrollDemo {
    public static void main(String[] args) {
        Employee[] staff = new Employee[] {
            new SalariedEmployee("Alex", 3000),
            new HourlyEmployee("Bee", 0, 160, 15), // 160 hours * $15
            new TaxedSalariedEmployee("Chai", 5000, new FlatTax(0.15)),
            new TaxedSalariedEmployee("Dao", 1800, new ProgressiveTax())
        };

        System.out.println("=== Payslips (Template Method + Polymorphism) ===");
        for (Employee e : staff) {
            e.printPayslip();
        }
    }
}
