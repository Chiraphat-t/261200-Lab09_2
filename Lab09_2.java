void main() {
    Penguin a = new Penguin();
    a.move(); //can't fly

    Sparrow b = new Sparrow();
    b.fly();
    b.move();

    Ostrich c = new Ostrich();
    c.move(); //can't fly

    Eagle d = new Eagle();
    d.fly();
    d.move();
}
