/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author woratatmakasiranondh
 */
class Box<PlaceHolder> {
  PlaceHolder value; // PlaceHolder is a placeholder for any data type

  void set(PlaceHolder value) {
    this.value = value;
  }

  PlaceHolder get() {
    return value;
  }
}

public class GenericsDemo {
  public static void main(String[] args) {
    // Create a Box to hold a String
    Box<String> stringBox = new Box<>();
    stringBox.set("Hello");
    System.out.println("Value: " + stringBox.get());

    // Create a Box to hold an Integer
    Box<Double> intBox = new Box<>();
    intBox.set(50.6);
    System.out.println("Value: " + intBox.get());

    // Error by using primitive type
    // Box<int> intBox2 = new Box<int>(); //Error as using primitive type

  }
}
