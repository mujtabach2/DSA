public  class Car extends CarbonFootprint {
    double gallons;

    public Car(double gallons) {
        this.gallons = gallons;
    }
    double getCarbonFootprint() {
        return gallons * 20;
    }
}
