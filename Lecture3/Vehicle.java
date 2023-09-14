public class Vehicle {
    String name;
    int kms;

    Vehicle()
    {
        this.name = "";
        this.kms = 0;
    }

    Vehicle(String name, int kms)
    {
        this.name = name;
        this.kms = kms;
    }

    void display()
    {
        System.out.println("Name: " + this.name + ", KMs: " + this.kms);
    }
}
