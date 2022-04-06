package Lab8;

public class Horse extends Animal{
    final static int HORSE_MAX_SPEED = 100;

    public Horse() {
        super();
        speed = generateRandomSpeed(HORSE_MAX_SPEED);
    }
}
