package animals;

import interfaces.Run;
import interfaces.Voice;

public class Rabbit extends Herbivore implements Run, Voice {
    public Rabbit(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public String voice() {
        return null;
    }

    @Override
    public void run() {

    }
}
