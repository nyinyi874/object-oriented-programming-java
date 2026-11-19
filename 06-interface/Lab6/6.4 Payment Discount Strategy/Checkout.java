public class Checkout {
    private PaymentProcessor processor;
    private Discount discount;

    public Checkout(PaymentProcessor processor, Discount discount) {
        this.processor = processor;
        this.discount = discount;
    }
    public void setProcessor(PaymentProcessor p) { this.processor = p; }
    public void setDiscount(Discount d) { this.discount = d; }

    public boolean process(double total) {
        double toCharge = (discount == null) ? total : discount.apply(total);
        return processor.charge(toCharge);
    }
}
