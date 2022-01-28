package ru.geekbrains.hw1.t3;

public class MainApp { // Задание № 3
    public static void main(String[] args) {
//        Apple ap = new Apple(1.11f);
//        Box<Apple> appleBox = new Box<>(ap);
//        Box<Orange> orangeBox = new Box<>(new Orange());
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        Apple ap = new Apple(1.11f);
        appleBox.putFruit(ap);
        Orange or = new Orange(1.5);
        orangeBox.putFruit(or);
        appleBox.putFruit(new Apple());
        orangeBox.putFruit(new Orange());
        appleBox.putFruit(new Apple(1.8));
        orangeBox.putFruit(new Orange(2));
        appleBox.putFruit(new Apple(1.2f));
        orangeBox.putFruit(new Orange(1.55));

        System.out.println(appleBox.sumWeight());
        System.out.println(orangeBox.sumWeight());

        System.out.println(appleBox.compareTo(orangeBox));
        appleBox.putFruit(new Apple(1.44));
        System.out.println(appleBox.compareTo(orangeBox));

        Box<Apple> newAppleBox = new Box<>();
        newAppleBox.putFruit(new Apple());
        appleBox.shiftTo(newAppleBox);
        System.out.println(newAppleBox.sumWeight()); // 7.5499997 ho-ho-ho, 7.55 expected
        System.out.println(appleBox.sumWeight());
    }
}
