class Student extends Person {
    private String id;

    //@Override
    public void displayInfo() {                // chaining-friendly toString
        System.out.println("Student: " + name +", age "+ age + ", id " + id);
    }

}
