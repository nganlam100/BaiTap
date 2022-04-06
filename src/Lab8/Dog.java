package Lab8;

public class Dog extends Animal{
    final static int DOG_MAX_SPEED = 100;

    public Dog() {
        super();
        speed = generateRandomSpeed(DOG_MAX_SPEED);
    }
}
