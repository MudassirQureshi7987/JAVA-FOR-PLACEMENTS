

    // It is default by default
    /*
    Java Access Modifiers:

    1. public     -> accessible from anywhere
    2. protected  -> accessible in same package + subclasses
    3. default    -> accessible only within same package (no keyword)
    4. private    -> accessible only within the same class

    Note: Packages in Java = namespaces + folders
*/


// File: AccessDemo.java


public class AccessDemo {

    public int publicVar = 1;        // accessible everywhere
    protected int protectedVar = 2;  // accessible in same package & subclasses
    int defaultVar = 3;              // default access, same package only
    private int privateVar = 4;       // accessible only in this class

    public void showAccess() {
        System.out.println("Public: " + publicVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Default: " + defaultVar);
        System.out.println("Private: " + privateVar);
    }

    public void setter(int val) {
        privateVar = val;  // ✅ ok
    }

    public void getter() {
        System.out.println(privateVar);  // ✅ ok
    }

    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();
        System.out.println(obj.publicVar);       // ✅ ok
        System.out.println(obj.protectedVar);    // ✅ ok
        System.out.println(obj.defaultVar);      // ✅ ok
        System.out.println(obj.privateVar);      // ✅ ok

        obj.showAccess();  // ✅ ok

        obj.setter(10);    // ✅ ok
        obj.getter();      // ✅ ok
    }
}

// Another class in the same package
class SamePackage {
    void test() {
        AccessDemo obj = new AccessDemo();
        System.out.println(obj.publicVar);       // ✅ ok
        System.out.println(obj.protectedVar);    // ✅ ok
        System.out.println(obj.defaultVar);      // ✅ ok
        // System.out.println(obj.privateVar);   // ❌ ERROR

        obj.showAccess();  // ✅ ok

        obj.setter(10);    // ✅ ok
        obj.getter();      // ✅ ok
    }
}

