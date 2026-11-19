/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author woratatmakasiranondh
 */
// Define an interface
interface Animal {
    void makeSound();  // abstract method
    void eat();        // another abstract method
}

// Implementing the interface
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating bones.");
    }
}

// Another class implementing the same interface
class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating fish.");
    }
}

// Main class to test
public class InterfaceDemo {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();  // Output: Woof! Woof!
        dog.eat();        // Output: Dog is eating bones.

        cat.makeSound();  // Output: Meow!
        cat.eat();        // Output: Cat is eating fish.
    }
}

