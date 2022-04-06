package Lab8;

import java.security.SecureRandom;

public class Animal {
    protected int speed;

    public int getSpeed() {
        return speed;
    }

    public int generateRandomSpeed(int max){
        return new SecureRandom().nextInt(max);
    }
}
