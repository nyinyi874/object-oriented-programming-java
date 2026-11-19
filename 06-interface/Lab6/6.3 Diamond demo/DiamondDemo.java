/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author woratatmakasiranondh
 */
interface A {
    default void hello() {
        System.out.println("A");
    }
}

interface B {
    default void hello() {
        System.out.println("B");
    }
}

class C implements A, B {

    @Override
    public void hello() {
        // choose one (or compose both)
        // A.super.hello();
        // B.super.hello(); // or call both in some order
    }

}

public class DiamondDemo {
    public static void main(String[] args) {
        A a = new C();

        a.hello();
    }
}
