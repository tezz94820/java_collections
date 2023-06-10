import java.util.*;

//It helps to store in (key,value) pairs

//HashMap :- normal map
//TreeMap :- Sorts the keys in map

public class Map7 {
    public static void main(String[] args) {

        //intialize
        Map<Integer,String> map = new HashMap<>();
    
        //add elements
        map.put(1, "Hello");
        map.put(2, "were");
        map.put(3, "lop");
        System.out.println("Map = "+map);

        //update any key
        map.put(2,"query");
        System.out.println("Updated 2 key to query");
        System.out.println("Map = "+map);

        //to put only if it is absent
        map.putIfAbsent(2,"updated");
        System.out.println("only update 2 if not it is not present");
        System.out.println("Map = "+map);

        //check if a particular key is present or not
        System.out.println("Key 2 is present = "+map.containsKey(2));
        
        //check if a particular value is present or not
        System.out.println("value 'Hello' is present = "+map.containsValue("Hello"));

        //iterate in map
        System.out.println();
        System.out.println("iertation");
        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println("key = "+entry.getKey()+", value = "+entry.getValue());
        }

        //to get all the keys
        System.out.println("All Keys = "+map.keySet());

        //to get all the values
        System.out.println("All Values = "+map.values());

        //TreeMap
        System.out.println();
        System.out.println("TreeMap");
        Map<Integer,String> TMap = new TreeMap<>();
        TMap.put(3, "lop");
        TMap.put(1, "Hello");
        TMap.put(2, "were");
        System.out.println("Map = "+TMap);
        TMap.put(2,"query");
        System.out.println("Updated 2 key to query");
        System.out.println("Map = "+TMap);
        TMap.putIfAbsent(2,"updated");
        System.out.println("only update 2 if not it is not present");
        System.out.println("Map = "+TMap);
        System.out.println("Key 2 is present = "+TMap.containsKey(2));
        System.out.println("value 'Hello' is present = "+TMap.containsValue("Hello"));
        System.out.println();
        System.out.println("iertation");
        for(Map.Entry<Integer,String> entry : TMap.entrySet()){
            System.out.println("key = "+entry.getKey()+", value = "+entry.getValue());
        }
        System.out.println("All Keys = "+TMap.keySet());
        System.out.println("All Values = "+TMap.values());

    }
}
