class Base {
    Base() {
        System.out.println("I am a base class constructor");
    }

    Base(int x) {
        System.out.println("I am a parameterized constructor with value: " + x);
    }
}

class Child extends Base {
    Child() {
        super(10);  // Calls Base(int x)
        System.out.println("I am a child class constructor");
    }

    Child(int x, int y) {
        super(x);   // Still calls Base(int x)
        System.out.println("I am a child class 2-parameter constructor with values: " + x + ", " + y);
    }
}

class GrandChild extends Child {
    GrandChild(int x, int y, int z) {
        super(x, y); // Calls Child(int x, int y)
        System.out.println("I am a grandchild class 3-parameter constructor with values: " 
                           + x + ", " + y + ", " + z);
    }
}

public class ConstructorsInInheritance {
    public static void main(String[] args) {
        Base baseObj = new Base();        // Calls Base()
        System.out.println("------");

        Child childObj1 = new Child();    // Calls Child() → Base(int)
        System.out.println("------");

        Child childObj2 = new Child(5, 15); // Calls Child(int,int) → Base(int)
        System.out.println("------");

        GrandChild gc = new GrandChild(1, 2, 3); // Calls GrandChild(int,int,int) → Child(int,int) → Base(int)
    }
}

