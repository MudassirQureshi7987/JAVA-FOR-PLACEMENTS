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
  }
}
