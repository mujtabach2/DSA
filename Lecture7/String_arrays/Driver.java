package String_arrays;

public class Driver {
    public static void display(String[] cities)
    {
        for (String city: cities)
        {
            System.out.println(city);
        }
        // time complexity  O(n)
    }
    public static void search(String[] cities)
    {
        String city_name = "Miami";  
        for (String city: cities)
        {
            if (city.equals(city_name))
            {
                System.out.println("Found");
                break;
            }
        }

            //equals() performs a case-sensitive comparison.
            //equalsIgnoreCase() performs a case-insensitive comparison.
             // time complexity  O(n)
    }
    public static void main(String[] args)
    {
        String[] cities = {"New York", "San Francisco", "Miami", "Dallas"};
        display(cities);
        search(cities);
        
    }
}
