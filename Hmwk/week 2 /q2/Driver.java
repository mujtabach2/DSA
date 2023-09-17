public class Driver {
    public static void main(String[] args)
    {

        
        // Car c = new Car(3);
        // Building b = new Building(20, 2, 3, 3, 1);
        // Bicylcle bi = new Bicylcle();

        // System.out.println("Carbon Footprint of Car: " + c.getCarbonFootprint());
        // System.out.println("Carbon Footprint of Building: " + b.getCarbonFootprint());
        // System.out.println("Carbon Footprint of Bicycle: " + bi.getCarbonFootprint());

        CarbonFootprint[] cf = new CarbonFootprint[3];
        cf[0] = new Car(3);
        cf[1] =  new Building(20, 2, 3, 3, 1);;
        cf[2] = new Bicylcle();


        for(int i = 0; i < cf.length; i++)
        {
            System.out.println("Carbon Footprint of "  + cf[i].getClass() + " " + cf[i].getCarbonFootprint());
        }
    }
}
