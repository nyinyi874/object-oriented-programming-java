/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author woratatmakasiranondh
 */
class Person {
    protected void greet() {
        System.out.println("Person.greet");
    }

    private void hidden() {
        System.out.println("Person.hidden (private)");
    }

    final void id() {
        System.out.println("Person.id (final)");
    }

    void callHidden() {
        hidden();
    }

    public static void main(String args[]) {
        Person p = new Person();
        Student s = new Student();

        p.hidden();
        // s.hidden();
    }
}
