import java.util.ArrayList;
import java.util.Collections;


public class Driver {

    public static void sameLengthSelectedWords(ArrayList<String> words)
    {
        int min = words.get(0).length(); // O(1)

        for(int i = 0; i < words.size(); i++)
        {
            if(words.get(i).length() < min)
            {
                min = words.get(i).length();
            }
        }

        for(int i = 0; i < words.size(); i++)
        {
            if(words.get(i).length() > min )
            {
                words.remove(i);
                i--;
            }
        }
        // space complexity: O(1)
        // time complexity: O(n) + O(n) = O(2n) = 0(n)

    }
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("Bye");
        words.add("Apple");
        words.add("Toronto");
        words.add("Eye");
        words.add("Oshawa");
        words.add("Pie");
        words.add("Ontario");

        System.out.println("\nOriginal ArrayList: ");
        System.out.println(words);

        sameLengthSelectedWords(words);
        System.out.println("\nArrayList with words having minimum length:");
        System.out.println(words);
        
        
    }
}