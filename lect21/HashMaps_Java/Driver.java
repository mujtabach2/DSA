package HashMaps_Java;

import java.util.HashMap;


public class Driver {
    public static void main(String[] args)
    {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Hello");
        map.put(2, "World");
        map.put(3, "Java");
        map.put(4, "Programming");
        map.put(5, "Language");

        System.out.println(map);

        System.out.println(map.get(1));

        System.out.println(map.containsValue("Hello"));
    }

}
