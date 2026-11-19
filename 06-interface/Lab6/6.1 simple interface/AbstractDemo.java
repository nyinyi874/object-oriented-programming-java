/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author woratatmakasiranondh
 */
// Define an abstract class
abstract class Animal {
    // Abstract methods (no body)
    abstract void makeSound();
    abstract void eat();

    // A concrete (normal) method can also exist in an abstract class
    public void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

// Dog class extends abstract Animal
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }

    @Override
    void eat() {
        System.out.println("Dog is eating bones.");
    }
}

// Cat class extends abstract Animal
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow!");
    }

    @Override
    void eat() {
        System.out.println("Cat is eating fish.");
    }
}

// Main class to test
public class AbstractDemo {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();  // Output: Woof! Woof!
        dog.eat();        // Output: Dog is eating bones.
        dog.sleep();      // Output: Animal is sleeping...

        cat.makeSound();  // Output: Meow!
        cat.eat();        // Output: Cat is eating fish.
        cat.sleep();      // Output: Animal is sleeping...
    }
}

