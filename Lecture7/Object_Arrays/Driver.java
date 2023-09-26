package Object_Arrays;


import java.util.Arrays;


public class Driver {

    public static void display(Student[] students)
    {
        for (Student student: students)
        {
            System.out.println(student);
        }
        // time complexity  O(n)
    }

    public static void searchStudents(Student[] students)
    {
        for (Student student: students){
            if (student.name.equalsIgnoreCase("elon"))
            {
                System.out.printf("%s found", student.name);
            }
        }
        // Time Complexity = O(n) 
    }

    public static void sort_students(Student students[])
    {
        int n = students.length;
        boolean swapped;

        do{
            swapped = false;
            for (int i = 0; i < n - 1; i++)
            {
                if (students[i].age > students[i + 1].age)
                {
                    Student temp = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);

        // Time Complexity = O(n^2)
    }
    public static void main(String[] args)
    {
        Student[] students = new Student[3];
        students[0] = new Student("elon", 20);
        students[1] = new Student("Bob", 21);
        students[2] = new Student("Mike", 18);

        display(students);
        Arrays.sort(students); // sort() method can be used to sort any collection but class has to implement Comparable
        // O(nlogn)
        // YOU COULD ALSO JUST DO IT DIRECTLY WITHOUT COMPARABLE
        // Arrays.sort(students, new Comparator<Student>() 
        // {
        //     public int compare(Student s1, Student s2)
        //     {
        //         return Integer.compare(s1.age, s2.age);
        //     }
        // }); // O(nlogn)

        // // for alpha order 
        // Arrays.sort(students, new Comparator<Student>() 
        // {
        //     public int compare(Student s1, Student s2)
        //     {
        //         return s1.name.compareToIgnoreCase(s2.name);
        //     }
        // }); // O(nlogn)
        display(students);

    }

    
}
