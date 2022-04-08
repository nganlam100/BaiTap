package Lab9;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class AnimalRacing {
    public static void main(String[] args) {
        AnimalWithBuilder tiger = new AnimalWithBuilder.Builder()
                .setName("Tiger")
                .setFlyable(false)
                .setSpeed(new SecureRandom().nextInt(100))
                .builder();
        AnimalWithBuilder falcon = new AnimalWithBuilder.Builder()
                .setName("Falcon")
                .setFlyable(true)
                .setSpeed(new SecureRandom().nextInt(100))
                .builder();
        AnimalWithBuilder eagle = new AnimalWithBuilder.Builder()
                .setName("Eagle")
                .setFlyable(true)
                .setSpeed(new SecureRandom().nextInt(100))
                .builder();
        AnimalWithBuilder snake = new AnimalWithBuilder.Builder()
                .setName("Snake")
                .setFlyable(true)
                .setSpeed(new SecureRandom().nextInt(100))
                .builder();

        List<AnimalWithBuilder> animalList = new ArrayList<>();
        animalList.add(tiger);
        animalList.add(falcon);
        animalList.add(eagle);
        animalList.add(snake);

        AnimalWithBuilder winner = new AnimalRacing().getWinner(animalList);
        System.out.println(animalList);
        System.out.printf("Winner is %s with speed %d", winner.getName(), winner.getSpeed());
    }

    public AnimalWithBuilder getWinner(List<AnimalWithBuilder> animalList) {
        if (animalList == null || animalList.size() == 0) {
            throw new IllegalArgumentException("Animal List can't be null");
        }

        AnimalWithBuilder winner = null;

        List<AnimalWithBuilder> notFlyable = new ArrayList<>();
        for (AnimalWithBuilder animal : animalList) {
            if (!animal.isFlyable()) {
                notFlyable.add(animal);
            }
            if (notFlyable.isEmpty()) {
                throw new RuntimeException("No eligible animal to race");
            } else if (notFlyable.size() == 1) {
                return animalList.get(0);
            } else if (animal.getSpeed() > winner.getSpeed()) {
                winner = animal;
            }
        }
        return winner;
    }
}
