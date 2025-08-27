import java.util.*;

public class Heap {
    
    public static void main(String []args)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // min heap by default opposite to C++ STL
        int arr[] = {5, 3, 8, 1, 4, 2, 7, 6,22,0,-1,-5};

        for(int x : arr)
        {
            pq.add(x); // O(log n)
        } // O(n log n) whole loop

        while(pq.size() > 0)
        {
            System.out.print(pq.peek() + " "); // O(1)
            pq.remove(); // O(log n)
        } // O(n log n) whole loop

        System.out.println();

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // max heap syntax
        for(int x : arr)
        {
            maxHeap.add(x);
        }

        while(maxHeap.size() > 0)
        {
            System.out.print(maxHeap.peek() + " ");
            maxHeap.remove();
        }
    }
}
