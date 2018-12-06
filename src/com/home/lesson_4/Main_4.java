package com.home.lesson_4;

public class Main_4 {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        System.out.println("isEmpty: " + list.isEmpty());
        print(list);

        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(7);
        list.insertFirst(8);
        list.insertFirst(9);
        list.insertFirst(10);

        System.out.println("size: " + list.size());
        print(list);

        System.out.println("insertFirst(11)");
        list.insertFirst(11);
        print(list);

        System.out.println("deleteFirst: " + list.deleteFirst());
        print(list);

        System.out.println("getFirst: " + list.getFirst());

        System.out.println("insertLast(77)");
        list.insertLast(77);
        print(list);

        System.out.println("getLast: " + list.getLast());

        System.out.println("deleteLast: " + list.deleteLast());
        print(list);

        System.out.println("get(3): " + list.get(3));

        System.out.println("set(2, 13)");
        list.set(2, 13);
        print(list);

        System.out.println("find(13):" + list.find(13));
        System.out.println("find(99):" + list.find(99));
        print(list);

        System.out.println("delete: " + list.delete(7));
        print(list);

        System.out.println("insert(1, 77)");
        list.insert(1, 77);
        print(list);


        System.out.println("isEmpty: " + list.isEmpty());
        print(list);
    }

    private static void print(MyLinkedList<Integer> myList) {
        for (Integer current :
                myList) {
            System.out.print(current + ", ");
        }
        System.out.println();
        System.out.println();
    }
}
