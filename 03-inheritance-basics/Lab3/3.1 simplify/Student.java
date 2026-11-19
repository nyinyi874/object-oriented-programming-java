class Student extends Person {
    private String id;

    Student() { 
        this("Unknown", 0, "N/A"); 
    } // constructor chaining

    Student(String name, int age, String id) {
        super(name, age);                     // call parent constructor
        this.id = id;                         // disambiguate field vs param
    }

    //@Override
    public void displayInfo() {                // chaining-friendly toString
        System.out.println("Student: " + name +", age "+ age + ", id " + id);
    }

}
