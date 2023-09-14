public class Rectangle extends Shape {
    
    Rectangle()
    {
        super();
    }

    Rectangle(double height, double width, String name)
    {
        super(height, width, name);
    }

    double calculateArea()
    {
        return height * width;
    }
}