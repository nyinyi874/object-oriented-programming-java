public interface LogA {
    default void audit(double amount) {
        System.out.println("LogA: " + amount);
    }
}
