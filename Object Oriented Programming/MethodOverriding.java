class A{

    void show(){
        System.out.println("In A");
    }

    void meth2() {
        System.out.println("In meth2 of A");
    }
}

class B extends A {

    @Override
    void meth2() {
        System.out.println("In meth2 of B");
    }
    // It is getting overridden, we can add a '@Override' annotation above it to indicate that we are overriding a method.
    // It is not mandatory, but it helps to catch errors at compile time if the method signature does not
    // match any method in the superclass.
    // If in the future, we change the method name in the superclass, the subclass will throw an error during compilation.
    // Therefore, it is a good practice to use the @Override annotation when overriding methods.
    // Arguments, return type, and method name must be the same.

    void meth3() {
        System.out.println("In meth3 of B");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        A obj = new B();  // Upcasting
        obj.show();  // Calls A's show()
        obj.meth2();  // Calls B's meth2() due to overriding
        // obj.meth3();  // Error: Cannot find symbol, as reference type is A

        B obj2 = new B();  // No upcasting, reference type is B
        obj2.show();  // Calls A's show()
        obj2.meth2();  // Calls B's meth2()
        obj2.meth3();  // Calls B's meth3()
    }
}
