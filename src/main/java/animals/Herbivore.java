package animals;

import food.Grass;
import food.Meat;

public abstract class Herbivore extends Animal {
    public Herbivore(String name, int age, int weight) {
        super(name, age, weight);
    }

    public void eat(Grass food) {
    }
}
