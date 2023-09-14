public class Car implements Drawable{
    String name;
    public Car()
    {
        this.name = "";
    }   

    public Car(String name)
    {
        this.name = name;
    }
   
    public void draw()
    {
        System.out.println("Drawing a car");
    }
}
// to use an interface, you must implement it
//remmber u have to use/override all the methods in the interface
// u can use multiple interfaces in a class