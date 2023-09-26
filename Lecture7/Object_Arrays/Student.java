package Object_Arrays;

public class Student implements Comparable<Student>{
    String name;
    int age;

    Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String toString()
    {
        return "Student [name=" + name + ", age=" + age + "]";
    }
    // Arrays.sort() method can be used to sort any collection but class has to implement Comparable
    public int compareTo(Student student)
    {
        return Integer.compare(this.age, student.age);
    }
}
