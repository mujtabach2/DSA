public class Triangle extends Shape{
    
    Triangle()
    {
        super();
    }

    Triangle(double height, double width, String name)
    {
        super(height, width, name);
    }

    double calculateArea()
    {
        return (height* width)/2;
    }
}