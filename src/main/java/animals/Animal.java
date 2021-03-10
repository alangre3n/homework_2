package animals;

import food.Food;

public abstract class Animal {
    protected String name;
    protected int age;
    protected int weight;

    public void eat (Food food) {
    }

    public Animal(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
}
