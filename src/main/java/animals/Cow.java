package animals;

import food.Grass;
import food.Meat;
import interfaces.Run;
import interfaces.Voice;

public class Cow extends Herbivore implements Voice, Run {
    public Cow(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void eat(Grass food) {
        super.eat(food);
    }

    @Override
    public String voice() {
        return null;
    }

    @Override
    public void run() {

    }
}
