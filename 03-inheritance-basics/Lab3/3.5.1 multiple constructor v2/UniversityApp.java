public class UniversityApp {
    public static void main(String[] args) {
        Student s1 = new Student();                    // mirrors Person()
        Student s2 = new Student("Bee");               // mirrors Person(String)
        Student s3 = new Student("Chai", 20);          // mirrors Person(String,int)
        Student s4 = new Student("Dao", 21, "S123", "CS"); // primary

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
        s4.displayInfo();

       
    }
}
