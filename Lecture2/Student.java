package Lecture2;

public class Student {
    // public static void main(String[] args)
    // {
    //     String name = "John";
    //     int age = 20;
    //     float cgpa = 3.53f;
    //     boolean isGraduated = false;
    //     double height = 5.11;

    //     System.out.println("Name: " + name);
    //     System.out.println("Age: " + age);
    //     System.out.println("CGPA: " + cgpa);
    //     System.out.println("Is Graduated: " + isGraduated);
    //     System.out.println("Height: " + height);
    //     System.out.printf("Name: %s \nAge: %d \nCGPA: %.2f \nActive: %s \nHeight: %.2f", name, age, cgpa, isGraduated, height);


    // }
    String name = "Steve Jobs";
    int age = 55;
    float cgpa = 2.95f;
    boolean active = true;
    double height = 5.11;

    public void display()
    {
        System.out.printf("Name: %s \nAge: %d \nCGPA: %.2f \nActive: %s \nHeight: %.2f", name, age, cgpa, active, height);
    }
    
    void calculateGrade()
    {
        if (cgpa > 3.5f && cgpa <=4.0f)
        {
            System.out.println("A");
        }
        else if (cgpa > 3.0f && cgpa <=3.5f)
        {
            System.out.println("B");
        }
        else if (cgpa > 2.5f && cgpa <=3.0f)
        {
            System.out.println("C");
        }
        else if (cgpa > 2.0f && cgpa <=2.5f)
        {
            System.out.println("D");
        }
        else
        {
            System.out.println("F");
        }
    }
    public static void main(String[] args)
    {
        Student student = new Student();
        student.display();
        student.calculateGrade();
    }
}
