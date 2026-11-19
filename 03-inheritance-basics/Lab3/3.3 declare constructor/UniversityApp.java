public class UniversityApp {
    public static void main(String[] args) {
        Person p = new Person("Alex", 40);
        p.displayInfo();

        
        Student s = new Student("Bee", 19);
        s.displayInfo();
        
        Student s2  = new Student();
        s2.displayInfo();

       
    }
}
