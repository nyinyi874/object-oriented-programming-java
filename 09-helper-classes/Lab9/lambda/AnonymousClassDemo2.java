package lambda;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author woratatmakasiranondh
 */
// Same functional interface
interface Greeting {
  void sayHello();
}

public class AnonymousClassDemo2 {
  public static void main(String[] args) {
    Greeting g = () -> System.out.println("Hello from lambda");
    g.sayHello();
  }
}
