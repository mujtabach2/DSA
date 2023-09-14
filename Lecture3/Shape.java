public class Shape {
    double height, width;
    String name;

    Shape()
    {
        this.height = this.width = 0.0;
        this.name = "";
    }
    Shape(double height, double width, String name)
    {
        this.height = height;
        this.width = width;
        this.name = name;
    }

    double calculateArea()
    {
        return 0.0;
    }
}