package animals;

import interfaces.Fly;
import interfaces.Voice;

public class Duck extends Herbivore implements Fly, Voice {
    public Duck(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public String voice() {
        return null;
    }

    @Override
    public void fly() {

    }
}
