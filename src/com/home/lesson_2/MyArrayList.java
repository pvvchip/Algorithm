package com.home.lesson_2;

public class MyArrayList<Item extends Comparable<Item>> {
    private int size = 0;
    private Object[] list = new Object[1];

    public void clean() {
        size = 0;
        list = new Object[1];
    }

    private void resize(int capacity) {
        Object[] temp = new Object[capacity];
        for (int i = 0; i < size; i++) {
            temp[i] = list[i];
        }
        list = temp;
    }

    public int size() {
        return size;
    }

    public void insert(Item item) {
        if (size == list.length) {
            resize(2 * list.length);
        }
        list[size++] = item;
    }

    // добавление с сортировкой
    public void insertSort(Item item) {
        insert(item);
        int i = size - 1;
        while (i > 0 && get(i).compareTo(get(i - 1)) < 0) {
            Item temp = get(i);
            set(i, get(i - 1));
            set(i - 1, temp);
            i--;
        }
    }

    public boolean delete(Item item) {
        int i = 0;
        while (i < size && !list[i].equals(item)) {
            i++;
        }
        if (i == size) {
            return false;
        }
        for (int j = i; j < size - 1; j++) {
            list[j] = list[j + 1];
        }
        list[size - 1] = null;
        size--;

        if (size == list.length / 4 && size > 0) {
            resize(list.length / 2);
        }
        return true;
    }

    public Item get(int index) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException();
        }
        return (Item) list[index];
    }

    public void set(int index, Item item) {
        if (index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException();
        }

        list[index] = item;
    }

    //    поиск линейный
    public boolean find(Item item) {
        for (int i = 0; i < size; i++) {
            if (list[i].equals(item)) {
                return true;
            }
        }
        return false;
    }

    //    поиск двоичный
//    предворительно нужно сделать сортировку
    public boolean binaryFind(Item item) {
        int low = 0;
        int hi = this.size() - 1;
        while (low <= hi) {
            int mid = low + (hi - low) / 2;
            if (item.compareTo(this.get(mid)) < 0) {
                hi = mid - 1;
            } else if (item.compareTo(this.get(mid)) > 0) {
                low = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < size; i++) {
            s = s + list[i] + ", ";
        }
        return s;
    }

    // сортировка методом выбора
    public void selectionSort() {
        for (int i = 0; i < size - 1; i++) {
            int min = i;
            for (int j = i + 1; j < size; j++) {
                if (less((Item) list[j], (Item) list[min])) {
                    min = j;
                }
            }
            exch(i, min);
        }
    }

    // сортировка методом вставки
    public void insertionSort() {
        for (int i = 0; i < size; i++) {
            for (int j = i; j > 0; j--) {
                if (less((Item) list[j], (Item) list[j - 1])) {
                    exch(j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    // сортировка методом пузырьков
    public void boobleSort() {
        int out, in;
        for (out = size - 1; out > 1; out--) {
            for (in = 0; in < out; in++) {
                if (less((Item) list[in + 1], (Item) list[in])) {
                    exch(in, in + 1);
                }
            }
        }
    }

    private boolean less(Item item1, Item item2) {
        return item1.compareTo(item2) < 0;
    }

    private void exch(int i, int j) {
        Item temp = (Item) list[i];
        list[i] = list[j];
        list[j] = temp;
    }

    public void test(MyArrayList<Integer> myArrayList) {
        System.out.println("******** Start test");
        myArrayList.insert(2);
        myArrayList.insert(6);
        myArrayList.insert(4);
        myArrayList.insert(8);
        myArrayList.insert(3);
        myArrayList.insert(1);
        System.out.println(myArrayList.size());
        System.out.println(myArrayList.toString());
        myArrayList.delete(1);
        System.out.println(myArrayList.toString());
        System.out.println(myArrayList.find(11));
        System.out.println(myArrayList.find(6));

        System.out.println("boobleSort");
        myArrayList.boobleSort();
        System.out.println(myArrayList.toString());

        myArrayList.clean();
        myArrayList.insert(2);
        myArrayList.insert(6);
        myArrayList.insert(4);
        myArrayList.insert(8);
        System.out.println("selectionSort");
        myArrayList.selectionSort();
        System.out.println(myArrayList.toString());

        myArrayList.clean();
        myArrayList.insert(2);
        myArrayList.insert(6);
        myArrayList.insert(4);
        myArrayList.insert(8);
        System.out.println("insertionSort");
        myArrayList.insertionSort();
        System.out.println(myArrayList.toString());

        System.out.println("Бинарный поиск 11 , 6");
        myArrayList.clean();
        myArrayList.insertSort(2);
        myArrayList.insertSort(6);
        myArrayList.insertSort(4);
        myArrayList.insertSort(8);
        System.out.println(myArrayList.binaryFind(11));
        System.out.println(myArrayList.binaryFind(6));
        System.out.println("******** End test");
    }
}
