public class Toy implements Drawable {
    String type;
    Toy(String type) {
        this.type = type;
    }
    public void draw() {
        System.out.println("Drawing a " + type);
    }
}
