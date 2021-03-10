package animals;

import interfaces.Swim;

public class Fish extends Carnivorous implements Swim {
    public Fish(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void swim() {

    }
}
