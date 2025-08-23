import java.util.*;


public class StackAndQueue {
  public static void main(String[] args)
  {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println("Stack: " + st);

        System.out.println("Top element: " + st.peek());
        System.out.println("Popped element: " + st.pop()); // pop also returns the top element unlike in C++
        System.out.println("Stack after pop: " + st);


        ArrayDeque<Integer> que = new ArrayDeque<>();
        que.addLast(10); // enqueue
        que.addLast(20);
        que.addLast(30);
        System.out.println("Queue: " + que);

        que.addLast(40);
        System.out.println("Queue after adding 40: " + que);

        System.out.println("Front element: " + que.getFirst());  // getFirst does not remove the element unlike in C++
        System.out.println("Queue after getFirst: " + que);     
        
        System.out.println("Removed element: " + que.removeFirst()); // dequeue
        System.out.println("Queue after removeFirst: " + que);
  }
}
