package DSA;

import java.util.Arrays;
import java.util.Iterator;

class ArrayList<T> implements Iterable<T> {
    T[] arr;
    int size;
    int capacity;
    static final int initialcapacity = 8;

    @SuppressWarnings("unchecked")
    ArrayList() {
        arr = (T[]) new Object[initialcapacity];
        size = 0;
        capacity = initialcapacity;
    }

    // insert at end
    public void inserAtEnd(T val) {
        if (size == capacity) {
            expadArray();
        }
        arr[size++] = val;//0
    }

    // private expandArray
    private void expadArray() {
        capacity *= 2;
        arr = Arrays.copyOf(arr, capacity);
    }

    // display
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(i);
        }
    }

    // insert at pos
    public void insertAtpos(int pos, T val) {//2
        if (pos < 0 || pos > size) {
            throw new IndexOutOfBoundsException("invalid pos");
        }
        if (size == capacity) {
            expadArray();
        }

        for (int i = size - 1; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }

        arr[pos] = val;
        size++;
    }

    // delete at pos
    public void delete(int pos) {
        if (pos < 0 || pos >= size) {
            throw new IndexOutOfBoundsException("invalid pos");
        }

        for (int i = pos; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        size--;
    }

    public T deleteAtEnd() {
        return arr[--size];
    }

    public int length() {
        return size - 1;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public T next() {
                return arr[index++];
            }
        };
    }
}
class C_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.inserAtEnd(0);
        list.inserAtEnd(1);
        list.inserAtEnd(2);
        list.inserAtEnd(3);
        list.display();

        System.out.println("-------------------");

        list.delete(0);

        // list.display();
        for (int a : list) {
            System.out.println(a);
        }

        System.out.println("-------------------");

        list.display();
        // Iterator<Integer> i = list.iterator();
    }
}