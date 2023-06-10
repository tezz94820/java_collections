import java.util.*;

public class Stack2 {
    public static void main(String[] args) {

        //initialize
        Stack<Integer> st = new Stack<>();

        //pushing/adding the elements
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println("stack = "+st);
    
        //get the top element
        System.out.println("Top element in st = "+st.peek());

        //pop/remove the top element
        st.pop();
        System.out.println("Stack = "+st);
    
    
    }
}
