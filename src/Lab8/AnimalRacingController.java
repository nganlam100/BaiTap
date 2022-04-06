package Lab8;

import java.util.ArrayList;
import java.util.List;

public class AnimalRacingController {
    public Animal getWinner(List<Animal> animalList) {
        Animal winner = null;
        for (Animal animal : animalList) {
            if (winner == null) {
                winner = animal;
            } else if (animal.getSpeed() > winner.getSpeed()) {
                winner = animal;
            }
        }
        return winner;
    }

    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Tiger());
        animalList.add(new Dog());
        animalList.add(new Horse());

        Animal winner = new AnimalRacingController().getWinner(animalList);
        System.out.printf("Winner is %s with speed %d", winner.getClass().getSimpleName(), winner.speed);

    }
}


