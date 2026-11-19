public class Student extends Person {
    private String studentId;
    private String major;

    // Primary (most specific) constructor:
    public Student(String name, int age, String studentId, String major) {
        super(name, age);             // ✅ must be first: delegate to Person(name, age)
        this.studentId = studentId;
        this.major = major;
    }

    // Mirror #1 → Person() 
    public Student() {
        super();
        //this("Unknown", 0, "N/A", "Undeclared"); 
        // calls the primary ctor → which calls super("Unknown", 0)
    }

    // Mirror #2 → Person(String name)
    public Student(String name) {
        super(name);
        //this(name, 0, "N/A", "Undeclared");      
        // then primary ctor calls super(name, 0)
    }

    // Mirror #3 → Person(String name, int age)
    public Student(String name, int age) {
        super(name,age);
        //this(name, age, "N/A", "Undeclared");    
        // then primary ctor calls super(name, age)
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // reuse Person printing
        System.out.println("StudentId: " + studentId + ", major: " + major);
    }
}