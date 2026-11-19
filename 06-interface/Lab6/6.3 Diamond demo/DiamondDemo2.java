/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author woratatmakasiranondh
 */
interface Root {
    default void hello() {
        System.out.println("Root");
    }
}

interface A extends Root {
    // @Override
    default public void hello() {
        System.out.println("A");
    }
}

interface B extends Root {
    /*
     * @Override
     * default void hello() {
     * System.out.println("B");
     * }
     */
}

class C implements B, A {
    /*
     * @Override
     * public void hello() {
     * // choose one (or compose both)
     * // A.super.hello();
     * // B.super.hello(); // or call both in some order
     * }
     */

}

public class DiamondDemo2 {
    public static void main(String[] args) {
        Root a = new C();

        a.hello();
    }
}
