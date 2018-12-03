package com.home.lesson_3;

public class Deque<Item> {

    int size = 0;
    int head = 0; //голова
    int tail = 0; //хвост
    private Object[] Deque = new Object[1000];


    public void PushBack(Item value) //добавление в конец очереди
    {
        if (++tail == size)
            tail = 0;
        Deque[tail] = value;
    }

    public Object PopBack() //выборка с конца очереди
    {
        Object ret = Deque[tail];

        if (--tail < 0)
            tail = size - 1;
        return ret;
    }

    void PushFront(int value) //добавление в начало очереди
    {
        Deque[head] = value;
        if (--head < 0)
            head = size - 1;
    }

    public Object PopFront() // выборка с начала очереди
    {
        if (++head == size)
            head = 0;
        return Deque[head];
    }
}
