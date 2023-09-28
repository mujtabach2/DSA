package Array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Driver {

    public static void display(ArrayList<String> fruits){
        for(int i=0; i<fruits.size(); i++)
        {
            // use get method to get index in arraylist
            System.out.println(fruits.get(i));
        }
    }

    public static boolean compare(ArrayList<String> list1, ArrayList<String> list2)
    {
        for(int i = 0; i < list1.size(); i++)
        {
            if(list1.get(i) != list2.get(i))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");  

        fruits.set(1, "Mango"); // replace banana with mang0
        fruits.remove(3); // remove grapes // this reduces size a regular array wont do this
        fruits.remove("Apple"); // remove apple

        display(fruits);
        System.out.println(compare(fruits, fruits));

        
        fruits.equals(fruits);

        System.out.println(fruits);

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("John", 20));
        students.add(new Student("Jane", 21));
        students.add(new Student("Jack", 22));
        students.add(new Student("Jill", 23));

        // no need for display method with ArrayList<Student>
        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student s1, Student s2)
            {
                return s1.name.compareTo(s2.name);
            }
        });
        System.out.println(students);

        

    }
}