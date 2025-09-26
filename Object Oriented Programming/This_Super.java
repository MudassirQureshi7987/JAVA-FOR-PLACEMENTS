class Base {
    private int a;

    public void setA(int a) {
        // When local variables (e.g., method parameters) have the same name as instance variables,
        // this helps to distinguish between them.
        this.a = a;
    }

    // To call another method of the same class
    void show() {
        System.out.println("Hello from show()");
    }

    void display() {
        this.show();  // calls show() method
    }

    // To call one constructor from another (constructor chaining)

    // this() must be the first statement in the constructor.
    Base() {
        this(100); // calling parameterized constructor
        System.out.println("Default constructor");
    }

    Base(int x) {
        System.out.println("Parameterized constructor: " + x);
    }

    // To pass the current object as a parameter
    void print(Base e) {
        System.out.println("Method called using this object");
    }

    void call() {
        print(this); // passing current object
    }

    // To return the current object
    Base getObject() {
        return this; // returning current object
    }
}

public class This_Super {
    public static void main(String[] args) {

    }
}

/*
In Java, the this keyword is a special reference variable that refers to the current object of the class.

this always refers to the current instance (object) inside non-static methods or constructors.

this cannot be used inside static methods because static methods do not belong to any particular object.
 */
