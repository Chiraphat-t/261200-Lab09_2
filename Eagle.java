public class Eagle implements Flyable {
    @Override
    public void fly() {
        System.out.println("Eagle flyy");
    }

    @Override
    public void move() { //Flyable extends Moveable
        System.out.println("Eagle walk");

    }
}
