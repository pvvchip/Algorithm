package com.home.lesson_5;

public class Main_5 {
    public static void main(String[] args) {
        System.out.println("myPow: " + myPow(2, 8));
        System.out.println("myPowSpeed: " + myPowSpeed(2, 8));
        System.out.println("myPowSpeed: " + myPowSpeed(2, 9));
        System.out.println("myPowRec: " + myPowRec(2, 8));
        System.out.println("myPowRecSpeed: " + myPowRecSpeed(2, 8));
        System.out.println("myPowRecSpeed: " + myPowRecSpeed(2, 9));
        System.out.println();

        int nDisks = 5;
        doTowers(nDisks, 'A', 'B', 'C');
    }

    private static void doTowers(int topN, char from, char inter, char to) {
            if (topN == 1){
                System.out.println("Disk 1 from "
                        + from + " to " + to);
            }else {
                doTowers(topN - 1, from, to, inter);
                System.out.println("Disk "
                        + topN + " from " + from + " to " + to);
                doTowers(topN - 1, inter, from, to);
            }
    }

    public static int myPowSpeed(int num, int exp) {
        if (exp % 2 == 0) {
            int i = myPow(num, exp / 2);
            return i * i;
        } else return myPow(num, exp);
    }

    public static int myPow(int num, int exp) {
        int result = 1;
        while (exp > 0) {
            result *= num;
            exp--;
        }
        return result;
    }

    // f(a, b) = f(a, b-1) * a

    public static int myPowRecSpeed(int num, int exp) {
        if (exp % 2 == 0) {
            int i = myPowRec(num, exp / 2);
            return i * i;
        } else return myPowRec(num, exp);
    }

    public static int myPowRec(int num, int exp) {
        if (exp == 1) {
            return num;
        }
        if (num == 0 || exp == 0) {
            return 1;
        }
        return myPowRec(num, exp - 1) * num;
    }

}
