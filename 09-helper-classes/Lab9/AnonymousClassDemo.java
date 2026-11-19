

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author woratatmakasiranondh
 */
interface Greeting {
    void sayHello();
}

public class AnonymousClassDemo {
    public static void main(String[] args) {
        Greeting g = new Greeting() { // anonymous class
            @Override
            public void sayHello() {
                System.out.println("Hello from Anonymous Class!");
            }
        };
        g.sayHello();
    }
}

