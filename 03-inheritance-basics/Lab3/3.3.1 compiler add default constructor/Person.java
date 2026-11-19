public class Person {
    protected String name;
    protected int age;

    //private String name;
    //private int age;
    
    public Person() {   //constructor chaining
        this("Unknown", 0);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
 

    public void displayInfo() {
        System.out.println("Person: " + name + ", age " + age);
    }
}
