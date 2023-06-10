import java.util.*;

//this is a doubly ended queue 
//we can add the elements fromm front and rear end
//we can remove elements from top and rear end.

public class ArrayDeque5{
    public static void main(String[] args) {
        
        //intialize
        ArrayDeque<Integer> adq = new ArrayDeque<Integer>();
        
        //adding the elemtns
        adq.offer(42);  //add to rear
        adq.offerFirst(23); //add to front
        adq.offerLast(85);  //add to rear
        adq.offerLast(65);  //add to rear
        adq.offerLast(74);  //add to rear

        System.out.println("ArrayDeque = "+adq);

        //peek
        System.out.println("peek = "+adq.peek());
        System.out.println("peekFirst = "+adq.peekFirst());
        System.out.println("peekLast = "+adq.peekLast());

        //poll
        adq.poll();
        System.out.println("Poll = "+adq);
        adq.pollFirst();
        System.out.println("PollFirst = "+adq);
        adq.pollLast();
        System.out.println("PollLast = "+adq);



    }
}