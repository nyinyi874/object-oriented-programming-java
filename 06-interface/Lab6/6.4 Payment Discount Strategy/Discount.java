@FunctionalInterface
public interface Discount {
    double apply(double total);
    static Discount none() { return t -> t; }
    static Discount percent(double rate) { return t -> t * (1.0 - rate); }
}
