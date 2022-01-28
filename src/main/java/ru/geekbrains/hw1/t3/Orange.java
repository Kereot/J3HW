package ru.geekbrains.hw1.t3;

public class Orange extends Fruit {
    private float weight;

    public Orange() {
        this.weight = 1.5f;
    }

    public Orange(Number weight) {
        this.weight = weight.floatValue();
    }

    @Override
    public float getWeight() {
        return weight;
    }
}
