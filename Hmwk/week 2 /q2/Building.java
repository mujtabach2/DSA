public class Building extends CarbonFootprint{
    int sqaureFeet, wood , concrete , glass, steel;

    public Building(int sqaureFeet, int wood, int concrete, int glass, int steel) {
        this.sqaureFeet = sqaureFeet;
        this.wood = wood;
        this.concrete = concrete;
        this.glass = glass;
        this.steel = steel;
    }

    double getCarbonFootprint(){
        return (sqaureFeet * (wood + concrete + glass + steel));
    }
}
