package Lab8;

public class Tiger extends Animal{
    final static int TIGER_MAX_SPEED = 100;
    public Tiger() {
        super();
        speed = generateRandomSpeed(TIGER_MAX_SPEED);
        System.out.println("Tiger: " +  speed);
    }
}
