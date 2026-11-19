public interface LogB {
    default void audit(double amount) {
        System.out.println("LogB: " + amount);
    }
}
