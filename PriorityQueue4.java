import java.util.*;
//it helps to define a queue by giving prority to elements.
//priority can be anything based on any function

public class PriorityQueue4 {
    public static void main(String[] args) {
        
        //initialize
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        //Priority = Min heap() :- least element will always be on top

        //adding the elemnts
        pq.offer(40);
        pq.offer(21);
        pq.offer(99);
        pq.offer(30);
        pq.offer(35);
        System.out.println("PQ = "+pq);

        //remove element 
        System.out.println("remove element = " + pq.poll());
        System.out.println("Updated PQ = "+pq);

        //get the top element
        System.out.println("Top Element = " + pq.peek());

        System.out.println();
        System.out.println("MaxHeap");
        //convert the min Heap priority to max heap property
        PriorityQueue<Integer> pqm = new PriorityQueue<>(Comparator.reverseOrder());
        //Priority = MAx heap() :- greatest element will always be on top
        pqm.offer(40);
        pqm.offer(21);
        pqm.offer(99);
        pqm.offer(30);
        pqm.offer(35);
        System.out.println("PQ = "+pqm);
        System.out.println("remove element = " + pqm.poll());
        System.out.println("Updated PQ = "+pqm);
        System.out.println("Top Element = " + pqm.peek());
    }
}
