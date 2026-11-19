/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author woratatmakasiranondh
 */
public class Student extends Person {

    @Override
    void greet() { // public access can be use, as super.greet() was protected, however,
        // default package-visible and private cannot use due to their more restruction
        System.out.println("Student.greet");
    }

    // overloaded method
    private void greet(int x) {// greet(int) method is not the override method
        for (int i = 1; i <= x; i++) {
            System.out.println("Student.greetX " + i);
        }
    }

}
