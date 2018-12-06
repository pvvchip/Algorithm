package com.home.lesson_2;

import java.util.Random;

public class Main_2 {
    private static int NUMBER_ITEM = 1000000;
    private static int NUMBER_MAX = 1000000;
    private static MyArrayList<Integer> myArrayList = new MyArrayList<>();

    public static void main(String[] args) {
        long start, finish;

        myArrayList.test(myArrayList);

        System.out.println("Сортировка методом Выбора");
        newAL();
        start = System.currentTimeMillis();
        myArrayList.selectionSort();
        finish = System.currentTimeMillis();
        System.out.println(finish - start + "ms");

        System.out.println("Сортировка методом Вставки");
        newAL();
        start = System.currentTimeMillis();
        myArrayList.insertionSort();
        finish = System.currentTimeMillis();
        System.out.println(finish - start + "ms");

        System.out.println("Сортировка методом Пузырька");
        newAL();
        start = System.currentTimeMillis();
        myArrayList.boobleSort();
        finish = System.currentTimeMillis();
        System.out.println(finish - start + "ms");
    }

    private static void newAL() {
        myArrayList.clean();
        Random rnd = new Random();
        for (int i = 0; i < NUMBER_ITEM; i++) {
            myArrayList.insert(rnd.nextInt(NUMBER_MAX));
        }
    }
}
