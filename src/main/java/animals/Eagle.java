package animals;

import interfaces.Fly;
import interfaces.Voice;

public class Eagle extends Carnivorous implements Fly, Voice {
    public Eagle(String name, int age, int weight) {
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
