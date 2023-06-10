import java.util.*;

//it is used for normal arrays :- used to implement many functionalites on array class

//functionalities
//1) binarySearch
//2)sort :- quicksort
//3)fill :- to fill the array with with a particular number

public class ArraysClass8 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        
        //binary search
        int index = Arrays.binarySearch(numbers, 4);
        System.out.println("Binary search of 4 : " + index);

        //sort
        Arrays.sort(numbers);

        //fill
        Arrays.fill(numbers,12);
        System.out.println("Array filled with 12 at every index");
        for(int i:numbers)
            System.out.print(i+" ");
    }
}
