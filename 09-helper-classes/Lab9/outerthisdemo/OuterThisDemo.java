/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package outerthisdemo;

/**
 *
 * @author woratatmakasiranondh
 */
class Outer {
    private String name = "OuterClass";

    class Inner {
        private String name = "InnerClass";

        void showNames() {
            System.out.println("Inner name: " + name);
            System.out.println("Outer name: " + Outer.this.name);
        }
    }
    
    static class StaticInner {
        void display() {
            // System.out.println(Outer.this); // ❌ Compile error!
        }
    }

    void test() {
        Inner in = new Inner();
        in.showNames();
    }
}

public class OuterThisDemo {
    public static void main(String[] args) {
        new Outer().test();
    }
}
