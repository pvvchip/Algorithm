package com.home.lesson_3;

import java.util.Scanner;

public class Main_3 {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        Queue<Integer> q = new Queue<Integer>();

        myStack.test(myStack);
        q.test(q);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = in.nextLine();

        Stack<Character> stChar = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stChar.push(str.charAt(i));
        }
        int temp = stChar.size();
        for (int i = 0; i < temp; i++) {
            System.out.print(stChar.pop());
        }
    }
}
