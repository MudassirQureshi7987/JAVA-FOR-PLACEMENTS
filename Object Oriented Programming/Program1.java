// One java file can contain multiple classes, but only one public class
// The name of the public class must match the name of the file

class Employee {
    // Non-public class

    int id;
    String name;
    public void printDetails() {
        System.out.println(id + " " + name);
    }
}
public class Program1 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Employee emp = new Employee();  // Instantiating a new employee object
        // Setting attributes / properties  
        emp.id = 101;
        emp.name = "Mudassir";
        // System.out.println(emp.id + " " + emp.name);

        emp.printDetails();  // Calling method to print details
    }
}
