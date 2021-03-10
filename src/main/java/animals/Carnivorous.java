package animals;

import food.Meat;

public abstract class Carnivorous extends Animal {
    public Carnivorous(String name, int age, int weight) {
        super(name, age, weight);
    }

    public void eat(Meat food) {
    }
}
