package LinkedList_Class;

import java.util.LinkedList;


public class Driver {

    public static int Convert(LinkedList<Integer> list) {
        int result = list.getFirst();

        for (int i = 1; i< list.size(); i++)
        {
            result = result * 2 + list.get(i);
        }
        
        return result;
    }
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(0);
        list.add(1);
        list.add(0);

        System.out.println(list);
        System.out.println(Convert(list));
    }
}
