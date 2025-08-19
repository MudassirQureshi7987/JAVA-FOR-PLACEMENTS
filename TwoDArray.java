import java.util.*;

public class TwoDArray {

    public static void fun(int[][] arr)
    {
        arr[0][0] = 11;
        arr[0][1] = 12;
        arr[0][2] = 13;
        arr[1][0] = 11;
        arr[1][1] = 12;
        arr[1][2] = 13;

        for(int i = 0;i < arr.length;i++)
        {
            for(int j = 0;j < arr[i].length;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String []args)
    {
        int[][] arr = new int[2][3];
        arr[0][0] = 11;
        arr[0][1] = 12;
        arr[0][2] = 13;
        arr[1][0] = 11;
        arr[1][1] = 12;
        arr[1][2] = 13;

        for(int i = 0;i < arr.length;i++)
        {
            for(int j = 0;j < arr[i].length;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int[][] jagged = new int[2][];

        jagged[0] = new int[3];
        jagged[1] = new int[4];

        fun(jagged);
    }
}
