import java.util.*;

public class Main{
    
    public static void main(String []args)
    {
        Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();
        // System.out.println("Your input was " + n);
        // System.out.print("Hello World");
        // System.out.println("Hello World");
        // System.out.print("Hello World");

        String s = scn.nextLine(); // reads the whole line including spaces 
        System.out.println(s);

     //   s = scn.next();  // reads until space and not the full line
     //   System.out.println(s);
        
        s = scn.next();   // reads only 2 space separated words // these 4 lines combined
        System.out.println(s);
        s = scn.next();
        System.out.println(s);
    }
}
