import java.util.*;

public class DatatypesAndPointers {
    
    public static void fun()
    {
        int temp = a;
        a = b;
        b = temp;
    }
    
    static int a = 10;
    static int b = 5;
    public static void main(String []args)
    {
        // There is no concept of pointer in java so therefore no concept of pass by reference,
        // only pass by value is there
        fun();
        System.out.println(a + " " + b);
    }
}


/*
Java Data Types:

Primitive (8 types):
1. byte   - 1 byte  (-128 to 127)
2. short  - 2 bytes (-32,768 to 32,767)
3. int    - 4 bytes (-2^31 to 2^31-1)
4. long   - 8 bytes (-2^63 to 2^63-1)
5. float  - 4 bytes (~7 decimal digits)
6. double - 8 bytes (~15 decimal digits)
7. char   - 2 bytes (Unicode, 0 to 65,535)
8. boolean- 1 bit   (true/false)

Non-Primitive:
- String, Arrays, Classes, Objects, Interfaces
*/
