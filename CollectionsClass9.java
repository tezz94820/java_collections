import java.util.*;

//gives extra funxtionalities to collections interfaces and classes

//functionalities
//1) min
//2) max
//3) frequency :- know the frequency of a particular value in list
//4) sort

public class CollectionsClass9 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(53);
        list.add(23);
        list.add(68);
        list.add(27);
        list.add(27);
        list.add(27);

        System.out.println("List = "+list);

        System.out.println("Minimum element: " + Collections.min(list));
        System.out.println("Maximum element: " + Collections.max(list));
        System.out.println("Frequncy of element 27: " + Collections.frequency(list,27));

        //sort
        Collections.sort(list);
        System.out.println("Sorted list = "+list);
        Collections.sort(list,Comparator.reverseOrder());
        System.out.println("Reverse sorted list = "+list);
        
    }
}
