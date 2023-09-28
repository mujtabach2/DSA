package Array_list;

import java.util.ArrayList;
import java.util.Collections;

public class Split {

    public static void main(String[] args)
    {
        ArrayList<Integer> numbers= new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        
        // to sort the arraylist use collections  
        Collections.sort(numbers);
        // to sort in reverse order
        Collections.sort(numbers, Collections.reverseOrder());


        // to split the arraylist
        ArrayList<Integer> firstHalf = new ArrayList<Integer>(numbers.subList(0, numbers.size()/2));
        ArrayList<Integer> secondHalf = new ArrayList<Integer>(numbers.subList(numbers.size()/2, numbers.size()));


    }
    
}
