public class Sparrow implements Flyable {
    @Override
    public void fly() {
        System.out.println("Sparrow fly");
    }

    @Override
    public void move() { //Flyable extends Moveable
        System.out.println("Sparrow jump");
    }
}
