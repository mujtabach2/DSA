public class Driver {
    
    public static void main(String[] args) {
        Student student = new Student("Steve Jobs", 55);
        student.display();

        Student.StudentDetails details = student.new StudentDetails();
        System.out.println(details.getFirstName());

        Car c = new Car("Camry", 55, "Sedan");
        c.display();

        Android android = new Android();
        android.makeCalls();
        android.browseInternet();
        android.iAmAndroid();
        
        Car car= new Car("Camry", 55, "Sedan");
        Vehicle v = car;
        v.display();
        Shape shapes[] = new Shape[5];
        shapes[0] = new Triangle(10.0, 5.0, "Triangle 1");
        shapes[1] = new Triangle(15.0, 15.0, "Triangle 2");
        shapes[2] = new Rectangle(10.0, 10.0, "Rectangle 1");
        shapes[3] = new Rectangle(20.0, 1.0, "Rectangle 2");
        shapes[4] = new Shape(10.0, 1.0, "General Shape");

        for (int i = 0; i <5; i++)
        {
            System.out.println("Shape is " + shapes[i].name);
            System.out.println("Area is " + shapes[i].calculateArea());
        }

        System.out.println("Total area is ");
    }
        
}