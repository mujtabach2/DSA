public class Student {
    String name;
    int age;

    Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    String getName()
    {
        return this.name;
    }

    int getAge()
    {
        return this.age;
    }

    void display()
    {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }

    class StudentDetails
    {
        String getFirstName()
        {
            String firstName[];

            firstName = name.split(" ", 2);

            return firstName[0];
        }
    }
}