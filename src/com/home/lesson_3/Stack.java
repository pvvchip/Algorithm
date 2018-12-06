package com.home.lesson_3;

import java.util.NoSuchElementException;

public class Stack<Item> {
    private Object[] stack = new Object[1];
    private int size = 0;

    private void resize(int capacity) {
        Object[] temp = new Object[capacity];
        for (int i = 0; i < size; i++) {
            temp[i] = stack[i];
        }
        stack = temp;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Item pop() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        Item item = (Item) stack[size-1];
        stack[size-1] = null;
        size--;
        if (size > 0 && size == stack.length / 4) {
            resize(stack.length / 2);
        }
        return item;
    }

    public void push(Item item) {
        if (size == stack.length) {
            resize(2 * stack.length);
        }
        stack[size++] = item;
    }

    public Item peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return (Item) stack[size-1];
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < size; i++) {
            s = s + stack[i] + ", ";
        }
        return s;
    }

    public void test(Stack<Integer> myStack) {
        System.out.println("--------------Stack start");
        myStack.push(2);
        myStack.push(6);
        myStack.push(4);
        myStack.push(3);
        System.out.println(myStack);
        System.out.println("Size: " + myStack.size());
        System.out.println("Peek: " + myStack.peek());

        System.out.println("Pop:  " + myStack.pop());
        System.out.println("Size: " + myStack.size());

        System.out.println("Peek: " + myStack.peek());

        System.out.println(myStack);
        System.out.println("Size: " + myStack.size());
        System.out.println("--------------Stack stop");

    }
}
