package localclassdemo;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author woratatmakasiranondh
 */
class Outer {
    void outerMethod() {
        int num = 10; // effectively final variable

        class Local {
            void print() {
                System.out.println("Local class: num = " + num);
            }
        }

        Local local = new Local();
        local.print();
    }
}

public class LocalClassDemo {
    public static void main(String[] args) {
        new Outer().outerMethod();
    }
}
