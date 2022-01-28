package ru.geekbrains.hw1.t3;

public class Apple extends Fruit {
    private float weight;

    public Apple() {
        this.weight = 1.0f;
    }

    public Apple(Number weight) {
        this.weight = weight.floatValue();
    }

    @Override
    public float getWeight() {
        return this.weight;
    }

}
