import java.util.*;

//as it is a set :- no dublicates are allowed
//set is always unordered

//Hash set :- unordered, no dublicates are allowed
//LinkedHashSet :- ordered, no dublicates are allowed
//TreeSet :- sorted,ordered, no dublicates are allowed

public class HashSet6 {
    public static void main(String[] args) {
        //initalize
        Set<Integer> set = new HashSet<>();

        //adding elemenys
        set.add(32);
        set.add(35);
        set.add(38);
        set.add(98);
        set.add(53);
        System.out.println("Set = "+set);

        //adding dublicate elements :- it does not add it
        set.add(32);
        set.add(32);
        set.add(32);
        System.out.println("Set = "+set);

        //removing an element
        set.remove(32);
        System.out.println("rempved 32, Set = "+set);

        //check if a element is present or not
        System.out.println("Element 53 is present = "+set.contains(53));

        //LinkedHashSet
        System.out.println();
        System.out.println("Linked Hash Set");
        Set<Integer> lhs = new LinkedHashSet<>();
        lhs.add(32);
        lhs.add(35);
        lhs.add(38);
        lhs.add(98);
        lhs.add(53);
        System.out.println("Set = "+lhs);
        lhs.add(32);
        lhs.add(32);
        lhs.add(32);
        System.out.println("Set = "+lhs);
        lhs.remove(32);
        System.out.println("rempved 32, Set = "+lhs);
        System.out.println("Element 53 is present = "+lhs.contains(53));

        //TreeSet
        System.out.println();
        System.out.println("Tree Set");
        Set<Integer> ts = new TreeSet<>();
        ts.add(32);
        ts.add(35);
        ts.add(38);
        ts.add(98);
        ts.add(53);
        System.out.println("Set = "+ts);
        ts.add(32);
        ts.add(32);
        ts.add(32);
        System.out.println("Set = "+ts);
        ts.remove(32);
        System.out.println("rempved 32, Set = "+ts);
        System.out.println("Element 53 is present = "+ts.contains(53));




        




    }
}
