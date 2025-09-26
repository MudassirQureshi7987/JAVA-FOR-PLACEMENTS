class Base {
    int x;

    public void printMe() {
        System.out.println("I am a method from Base class");
    }
}

class Child extends Base {
    int y;

    public void display() {
        System.out.println("I am a method from Child class");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Base baseObj = new Base();
        baseObj.x = 10;
        baseObj.printMe();

        Child derived = new Child();
        derived.x = 20;  // Inherited from Base
        derived.y = 30;  // Own property
        derived.printMe();  // Inherited method
        derived.display();  // Own method
    }
}
