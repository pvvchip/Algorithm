package com.home.lesson_3;

import java.util.NoSuchElementException;

public class Queue<Item> {
    private Object[] queue = new Object[1];
    private int size = 0;
    private int start = 0;  // первый элемент в очереди
    private int end = 0;    // место для вставки последнего элемента

    private void resize(int capacity) {
        Object[] temp = new Object[capacity];
        for (int i = 0; i < size; i++) {
            temp[i] = queue[(start + i) % size];
        }
        queue = temp;
        start = 0;
        end = size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void enqueue(Item item) {
        if (size == queue.length) {
            resize(2 * queue.length);
        }
        queue[end++] = item;
        size++;
    }

    public Item decqueue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        Item item = (Item) queue[start];
        queue[start] = null;
        size--;
        start++;
        start %= queue.length;
        if (size > 0 && size == queue.length / 4) {
            resize(queue.length / 2);
        }
        return item;
    }

    public Item peekFront() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return (Item) queue[start];
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < size; i++) {
            s = s + queue[(start + i) % queue.length] + ", ";
        }
        return s;
    }

    public void test(Queue<Integer> q) {
        System.out.println("--------------Queue start");
        q.enqueue(10);
        q.enqueue(13);
        q.enqueue(14);
        q.enqueue(20);
        System.out.println(q.peekFront());
        System.out.println(q.toString());
        System.out.println(q.decqueue());
        System.out.println(q.decqueue());
        System.out.println(q.decqueue());
        System.out.println(q.decqueue());
        System.out.println(q.isEmpty());
        System.out.println("--------------Queue stop");
    }
}
