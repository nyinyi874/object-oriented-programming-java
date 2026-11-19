/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author woratatmakasiranondh
 */
public class OverrideShowcase {
    public static void main(String arg[]) {
        Person p = new Person();
        Student s = new Student();

        System.out.println("This message from object p");
        p.greet();
        System.out.println("This message from object s (override)");
        s.greet();
        System.out.println("This message from object s (overload)");
        // s.greet(2); //this line cannot call due to private
    }
}
