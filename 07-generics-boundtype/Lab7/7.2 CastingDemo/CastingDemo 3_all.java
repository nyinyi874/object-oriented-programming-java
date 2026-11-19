/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author woratatmakasiranondh
 */
class Person {
    void show() { System.out.println("Person"); }
}

class Student extends Person {
    void study() { System.out.println("Student studying"); }
}



public class CastingDemo {

    public static void main(String[] args) {
        //Primitive Casting
        //Widen
        int myInt = 10;
        double myDouble = myInt; // Widening: int to double (automatic)
        System.out.println(myDouble);
        
        //Narrowing
        double myDouble2 = 9.78;
        int myInt2 = (int) myDouble2; // Narrowing: double to int (explicit, truncates decimal)
        System.out.println(myInt2); //9 data lost
        
        
        //Reference Casting
        //Upcast
        System.out.println("Reference Casting");
        Student s = new Student();
        Person p = s;  // Upcasting automatically
        p.show();      // Works
        // p.study();   // ❌ Not accessible via Person reference
        
        
        //Downcast
        System.out.println("Reference Casting:Downcast");
        Person p2 = new Student();   // upcast
        Student s2 = (Student) p2;    // downcast
        s2.study(); // Works fine
        ((Student)p2).study();     // Downcast and call subclass method
        
        
        //Downcast (Runtime error)
        Person p3 = new Person();
        //Student s3 = (Student) p3; // ❌ ClassCastException at runtime


        
        
    }
}
