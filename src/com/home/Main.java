package com.home;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int NUMBER_ITEM = 1000000;
        int NUMBER_MAX = 1000000;
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        Random rnd = new Random();

        myArrayList.test(myArrayList);
        myArrayList.clean();
        System.out.println(myArrayList.size());
        System.out.println(myArrayList.toString());

        for (int i = 0; i < NUMBER_ITEM; i++) {
            myArrayList.insert(rnd.nextInt(NUMBER_MAX));
        }
    }
}
