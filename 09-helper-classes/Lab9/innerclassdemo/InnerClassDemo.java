package innerclassdemo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author woratatmakasiranondh
 */
class Outer {
    private String message = "Hello from Outer";

    class Inner {
        void display() {
            System.out.println(message); // can access outer class member
        }
    }

    void test() {
        Inner in = new Inner();
        in.display();
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}

