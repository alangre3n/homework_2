package animals;

import interfaces.Run;
import interfaces.Voice;

public class Wolf extends Carnivorous implements Run, Voice {
    public Wolf(String name, int age, int weight) {
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
