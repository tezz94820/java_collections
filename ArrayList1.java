import java.util.*;

class ArrayList1{
    public static void main(String[] args) {
        //initialize the list interface with arraylist
        List<Integer> list = new ArrayList<>();
           
        //add the element to last
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("add at last = "+list);

        //add at index 
        list.add(1,50);
        System.out.println("add 50 at index-1  = "+list);

        //adding new list into original list
        List<Integer> newList = new ArrayList<>();
        newList.add(99);
        newList.add(100);
        newList.add(101);
        list.addAll(newList);
        System.out.println("list and newlist combined  = "+list);

        //to get the number according to index
        System.out.println("element at index-4 = "+list.get(4));

        //remove the element by index from list
        list.remove(3);
        System.out.println("removing index-3 from the list = "+list);

        //remove the element particular element by its value
        //always give the type of ArrayList in it .in this case this is Integer so wee used Integer.valueOd
        list.remove(Integer.valueOf(99));
        System.out.println("removing element-99 from the list = "+list);

        //update the element by it's index
        list.set(3,1000);
        System.out.println("Added 1000 at index-3 = "+list);

        //to check a particular element is present in it or not
        boolean contain = list.contains(1000);
        System.out.println("List contains 1000 = "+contain);

        //iteration using for loop
        System.out.print("for loop = ");
        for(int i=0;i<list.size();i++)
            System.out.print(list.get(i)+" ");
        System.out.println();

        //iteration using for each loop
        System.out.print("for each loop = ");
        for(Integer i:list)
            System.out.print(i+" ");
        System.out.println();

        //iterator
        Iterator<Integer> it = list.iterator();
        System.out.print("Iterator = ");
        while(it.hasNext())
            System.out.print(it.next()+" ");
        System.out.println();
        
        
        //remove all the elements in the list
        list.clear();
        System.out.println("List = "+list);

    }
}