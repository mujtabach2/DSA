package Good_String;

import java.util.HashMap;

public class Driver {
    

    public static boolean areOccurencesEqual(String s)
    {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch: s.toCharArray())
        {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // basically loops thru the map and compares value of each key to the value of the first key
        // if they are not equal, then return false since the string is not a good string
        for(char key: map.keySet())
        {
            if(map.get(key) != map.get(s.charAt(0)))
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        String s = "abacbc";
        System.out.println(areOccurencesEqual(s));
    }
}
