package com.home.lesson_8;

public class Main_8 {
    public static void main(String[] args) {
        System.out.println("ChainingHashTable");
        ChainingHashTable<Integer, String> myCHT = new ChainingHashTable<>();

        System.out.println("isEmpty: " + myCHT.isEmpty());

        myCHT.put(123, "Test 1");
        myCHT.put(124, "Test 2");
        myCHT.put(546546544, "Test 3");
        myCHT.put(126, "Test 4");
        myCHT.put(127, "Test 5");

        System.out.println("size: " + myCHT.size());
        System.out.println("isEmpty: " + myCHT.isEmpty());

        System.out.println("contains(124): " + myCHT.contains(124));
        System.out.println("get(127): " + myCHT.get(127));
        System.out.println();

        System.out.println("LinearProbingHashTable");
        LinearProbingHashTable<Integer, String> myLPHT = new LinearProbingHashTable<>();

        System.out.println("isEmpty: " + myLPHT.isEmpty());

        myLPHT.put(123, "Test 1");
        myLPHT.put(124, "Test 2");
        myLPHT.put(546546544, "Test 3");
        myLPHT.put(126, "Test 4");
        myLPHT.put(127, "Test 5");

        System.out.println("size: " + myLPHT.size());
        System.out.println("isEmpty: " + myLPHT.isEmpty());

        System.out.println("contains(124): " + myLPHT.contains(124));
        System.out.println("get(127): " + myLPHT.get(127));
    }
}
