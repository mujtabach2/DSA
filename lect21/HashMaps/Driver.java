public class Driver {
    public static void main(String[] args) {
        HashMap map = new HashMap(10);
        map.put(1, 25);
        map.put(2, 38);
        map.put(3, 46);
        map.put(4, 59);
        map.put(5, 94);
        map.put(1, 98);
        int value = 381;
        int key = 5;

        
        if ((value = map.get(key)) == -1)
        {
            System.out.println("No value found at that key");
        }
        else
        {
            System.out.printf("Value at %d: %d", key, value);
        }
    }
}