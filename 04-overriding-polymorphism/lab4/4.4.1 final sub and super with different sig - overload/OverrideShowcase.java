/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author woratatmakasiranondh
 */
public class OverrideShowcase {
    public static void main(String arg[]){
        Person p = new Person();
        Student s = new Student();
        
        System.out.println("This message from object p");
        p.id();
        System.out.println("This message from object s (NOT override), this will call final Person.id()");
        s.id();
        System.out.println("This message from object s (overload)");
        s.id("Testing");
        
    }
    
}
