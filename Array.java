import java.util.*;

public class Array {
    
    public static void fun(int[] arr)
    {
        arr[3] = 30;
        arr[4] = 40;

        for(int i = 0;i < arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String []args)
    {
        int[] arr = new int[5];  // arr is by default initialized with 0
        arr[0] = 10;
        arr[2] = 20;

        fun(arr);
        
        for(int val : arr)
        {
            System.out.println(val);
        }
    }
}
