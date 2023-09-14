public class Triangle extends Shape{
    
    Triangle()
    {
        super();
        //super() in Java is a reference variable that is used to refer parent class constructors
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