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
    public static final int ANIMALVARIABLE = 10;
    abstract void makeSound();  // abstract method
    default void eat(){        // another abstract method
        System.out.println("Animal Herbivor or Carnivor");
    }
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

class Fox implements Animal{
    @Override
    public void makeSound(){
        System.out.println("What da fox say");
    }
}

// Main class to test
public class InterfaceDemo {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal fox = new Fox();

        dog.makeSound();  // Output: Woof! Woof!
        dog.eat();        // Output: Dog is eating bones.

        cat.makeSound();  // Output: Meow!
        cat.eat();        // Output: Cat is eating fish.
        
        fox.makeSound();
        fox.eat();
    }
}

