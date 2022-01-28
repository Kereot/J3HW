package ru.geekbrains.hw1.t3;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    private ArrayList<T> fruit;

//    public Box(T... fruit) {
//        this.fruit = new ArrayList<>(Arrays.asList(fruit));
//    }

    public Box() {
        this.fruit = new ArrayList<>();
    }

    public void putFruit(T fruit) {
        this.fruit.add(fruit);
    }

    public float sumWeight() {
        float totalWeight = 0.0f;
        for (T fruit : fruit) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    public boolean compareTo(Box<?> f) {
        return Math.abs(sumWeight() - f.sumWeight()) < 0.01f;
    }

    public void shiftTo(Box<T> f) {
        if (!this.fruit.equals(f.fruit)) {
            f.fruit.addAll(this.fruit);
            this.fruit.clear();
            this.fruit.trimToSize();
        } else {
            System.out.println("Illegal destination");
        }
    }
}
