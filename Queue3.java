import java.util.*;

public class Queue3 {
    public static void main(String[] args) {
        //initialize using linked list
        Queue<Integer> q = new LinkedList<>();

        //adding the elements
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        System.out.println("Queue = "+q);

        //remove the element
        q.poll();
        System.out.println("remove element, Queue = "+q);

        //get the top/first_to_remove element
        System.out.println("Top element = "+q.peek());

        
    }
}
