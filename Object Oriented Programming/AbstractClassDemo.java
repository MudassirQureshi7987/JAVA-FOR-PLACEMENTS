// Abstract class cannot be instantiated that means we cannot create object of abstract class
// Abstract class is meant to be inherited by other classes
// Abstract class can have abstract and non-abstract methods
// Only concrete (non-abstract) subclass can be instantiated
// If a subclass does not implement all abstract methods of the abstract superclass, then the subclass must
// also be declared abstract

abstract class Animal{
    abstract void sound(); // abstract method
    abstract void sleep(); // abstract method

    void eat(){  // non-abstract method
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    @Override
    void sleep() {
        System.out.println("Dog sleeps");
    }
}

abstract class Cat extends Animal{
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
    // sleep() method is not implemented, so Cat must be declared abstract
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        // Animal a = new Animal(); // Error: Cannot instantiate the abstract class Animal
        Dog d = new Dog();
        d.sound(); // Calls Dog's sound()
        d.sleep(); // Calls Dog's sleep()
        d.eat();   // Calls Animal's eat()

        // Cat c = new Cat(); // Error: Cannot instantiate the abstract class Cat
    }
}
