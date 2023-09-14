public abstract class Shape {
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

    abstract double calculateArea();
    // abstract means that this is a messeage forrowarding for the child class to implement
    // can only be used in an abstract class. The body is provided by the subclass (inherited from).
    //cannot create an object of an abstract class
    //hold common methods and variables for the subclasses to inherit
    //abstract classes are usually parent classes
}
