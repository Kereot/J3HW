package ru.geekbrains.hw1.t1t2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Object> l = new ArrayList<>(Collections.emptyList()); // Просто потестировать
        Object[] arr = new Object[] {"One", 2, "Three", l, 5.0f};
        Integer[] arrI = new Integer[] {1, 2, 3, 4, 5}; // Просто потестировать
        String[] arrS = new String[] {"One", "Two", "Three", "Four", "Five"}; // Просто потестировать
        swap(arr, 1, 3);
        swap(arrI, 1 , 3);
        swap(arrS, 1 , 3);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrI));
        System.out.println(Arrays.toString(arrS));

        List<Object> t = new ArrayList<>(Arrays.asList(arr)); // Как вариант, без создания своего метода...
        Collections.swap(t, 2, 4);
        arr = t.toArray();
        System.out.println(Arrays.toString(arr));

        System.out.println(arrayToList(arr));
        System.out.println(arr.getClass());
        System.out.println(arrayToList(arr).getClass());

        System.out.println("2nd: " + arrayToListSecond(arr));
        System.out.println("2nd: " + arr.getClass());
        System.out.println("2nd: " + arrayToListSecond(arr).getClass());
    }

    public static void swap(Object[] array, int a, int b) { // Здание № 1
        Object temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static List<Object> arrayToList(Object[] array) { // Задание № 2
        return new ArrayList<>(Arrays.asList(array));
    }

    public static <T> ArrayList<?> arrayToListSecond(T[] array) { // Задание № 2
        return new ArrayList<>(Arrays.asList(array));
    }

}
