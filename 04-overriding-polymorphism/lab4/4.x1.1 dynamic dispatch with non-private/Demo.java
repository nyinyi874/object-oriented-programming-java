/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author woratatmakasiranondh
 */
class Person {
    public void hello() {
        System.out.println("Person.hello");
    }
    void callHello() {
        hello();           // always calls Person.hello
    }
    void greet() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'greet'");
    }
}

class Student extends Person {
    //@Override
    public void hello() {
        System.out.println("Student.hello");
    }
    void test() {
        hello();           // calls Student.hello
    }
    
}

public class Demo {
    public static void main(String[] args) {
        Person p = new Student();
        p.callHello();           // prints: Person.hello  (NOT Student.hello)

        Student s = new Student();
        s.test();                // prints: Student.hello
        //s.callHello();
    }
}

