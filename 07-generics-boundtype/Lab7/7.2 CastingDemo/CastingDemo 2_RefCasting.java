/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author woratatmakasiranondh
 */
class Person {
    void show() {
        System.out.println("Person");
    }
}

class Student extends Person {
    void study() {
        System.out.println("Student studying");
    }
}

public class CastingDemo {

    public static void main(String[] args) {
        // Primitive Casting
        int myInt = 10;
        double myDouble = myInt; // Widening: int to double (automatic)
        System.out.println(myDouble);

        double myDouble2 = 9.78;
        int myInt2 = (int) myDouble2; // Narrowing: double to int (explicit, truncates decimal)
        System.out.println(myInt2); // 9 data lost

        // Reference Casting
        Student s = new Student();
        Person p = s; // Upcasting automatically
        p.show(); // Works
        // p.study(); // ❌ Not accessible via Person reference

    }
}
