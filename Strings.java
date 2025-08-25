import java.util.*;

public class Strings {
    
    public static void main(String[] args)
    {
        // Scanner scn = new Scanner(System.in);
        // String str = scn.next();  // next() reads input till space
        // System.out.println(str);
        // str = scn.nextLine();  // fixed: added to consume the newline character cause of next() was used before
        // String s1 = scn.nextLine();  // nextLine() reads input till end of line
        // System.out.println(s1 + " with length of " + s1.length());

        // for(int i = 0;i < s1.length();i++)
        // {
        //     char ch = s1.charAt(i);   // we cannot directly print s1[i] like arrays
        //     System.out.println(ch);
        // }

        // s1.charAt(0) = 'a';  // error: strings are immutable in java
        // You cannot change a character at a particular index

        // Substring
        // String str = "abcdef";
        // System.out.println(str.substring(1,3));  // [1,3) => "bc"
        // System.out.println(str.substring(2));    // [2, end) => "cdef"
        // System.out.println(str.substring(1, 1));  
        // // empty string cause we only go till j-1th index when doing substring(i, j)

        // for(int i = 0;i < str.length();i++)
        // {
        //     for(int j = i + 1;j <= str.length();j++)
        //     {
        //         System.out.println(str.substring(i, j));
        //     }
        // }

        String s1 = "hello";
        String s2 = "world";
        String s3 = s1 + " " + s2;  // concatenation
        System.out.println(s3);

        String s4 = "hello";
        s4 += " "; // we can add characters or strings to existing string
        s4 += 'w';
        s4 += "orld";
        s4 += 10;  // we can also add numbers, boolean values etc. to strings
        System.out.println(s4); // hello world10

        System.out.println("hello" + 10 + 20); // hello1020 cause left to right evaluation and therefore first 10 is added to string and it becomes hello10 + 20
        System.out.println(10 + 20 + "hello"); // 30hello cause first 10 + 20 is evaluated and then added to string

        // Split
        String str = "abc def ghi jkl";
        String[] parts = str.split(" "); // splits the string around spaces, we can also split around other characters like s.split(",") etc.

        for(int i = 0;i < parts.length;i++)  // not length() cause it is an array and not a string
        {
            System.out.println(parts[i]);
        }

        // Difference between == and equals()
        // String a = "hello";
        // String b = "hello";
        // String c = new String("hello");

        // System.out.println(a == b); // true  ✅ (both point to same string literal in String Pool)
        // System.out.println(a == c); // false ❌ (c is a new object in heap memory)

        String a = "hello";
        String b = new String("hello");

        System.out.println(a.equals(b)); // true ✅ (contents are same: "hello")
        // equals() checks for value equality (contents), while == checks for reference equality (memory address)

    }
}
