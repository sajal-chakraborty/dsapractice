package com.test.temp;

class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Test {
    public static void main(String[] args) {
        // Upcasting: Dog to Animal (automatic)
        Dog dog = new Dog();
        Animal animal = dog; // Upcasting
        animal.makeSound(); // Allowed
        // animal.bark(); // Not allowed – Animal reference can't access Dog methods
        // Downcasting: Animal to Dog (manual)
        if (animal instanceof Dog) {
            Dog d = (Dog) animal; // Downcasting
            d.bark(); // Now allowed
        }

        if (animal instanceof Dog oneDog) {
            System.out.println("animal is an instance of Animal");
            oneDog.bark();

        }
        // Unsafe Downcasting – Will throw ClassCastException
        Animal a = new Animal();
        Dog fakeDog = (Dog) a; // Runtime error!
        fakeDog.bark(); // This line won't be reached
    }
}
