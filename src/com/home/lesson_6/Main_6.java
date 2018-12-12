package com.home.lesson_6;

import java.util.Random;

public class Main_6 {
    public static void main(String[] args) {
        Random rnd = new Random();
        BST<Integer, Integer> assArr = new BST<>();

        int tmp;
        for (int i = 0; i < 20; i++) {
            while (assArr.heightOfBinaryTree() < 6) {
                tmp = rnd.nextInt(200) - 100;
                assArr.put(tmp, 10);
                System.out.println(tmp);
            }
            System.out.println("Balance: " + assArr.isBalance());
            System.out.println();
            assArr = new BST<>();
        }
    }
}
