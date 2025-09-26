class Employee {
    int id;
    String name;

    public Employee() {
        System.out.println("Constructor called, object created!");
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class ConstructorDemo {
    
    public static void main(String[] args) {
        Employee emp1 = new Employee();  // Calls default constructor
        Employee emp2 = new Employee(101, "Alice");  // Calls parameterized constructor

        System.out.println("Employee 1: " + emp1.id + ", " + emp1.name);  // Default values
        System.out.println("Employee 2: " + emp2.id + ", " + emp2.name);  // Set values
    }
}


/*
        * 🔹 What is a Constructor?

        A constructor is a special method in a class used to initialize objects.

        Key points:

        Same name as the class.

        No return type (not even void).

        Automatically called when an object is created.

        Can be overloaded (multiple constructors with different parameters).
 */
