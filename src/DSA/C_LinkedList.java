package DSA;

import java.util.Iterator;

public class C_LinkedList<T> implements Iterable<T> {
    Node head;

    C_LinkedList() {
        // when instantiating linked list head will be null
        head = null;
    }

    // 1. insert at beginning
    public void insertAtBegining(T val) {
        // newnode contains address
        Node newNode = new Node(val);
        if (head == null) { // linked list is Empty scenario
            head = newNode;
        } else { // if Linked list has value
            newNode.next = head;
            head = newNode;
        }
    }

    // display or traverse the list
    public void display() {
        Node Temp = head;
        while (Temp != null) {
            System.out.print(Temp.data);
            Temp = Temp.next;
        }
    }

    // insert At position
    public void insertAtPosition(int pos, T data) {
        if (pos == 0) {
            insertAtBegining(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 1; i < pos; i++) { // previous node
            temp = temp.next;
            // temp is previous node address or reference
            if (temp == null)
                throw new IndexOutOfBoundsException("Invalid pos " + pos);
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // delete at position
    @SuppressWarnings("unchecked")
    public void deleteAtPosition(int pos) {
        if (head == null) {
            throw new IndexOutOfBoundsException("deletion attempted on empty list");
        }

        // delete first node criteria
        if (pos == 0) {
            head = head.next;
            return;
        }

        Node temp = head;
        Node prev = null;
        for (int i = 1; i < pos; i++) { // stop in the previous node
            prev = temp;
            temp = temp.next;
            // temp is to be deleted node address or reference
        }

        prev.next = temp.next;
    }

    @Override
    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        return new Iterator<T>() {
            Node Temp = head;

            @Override
            public boolean hasNext() {
                // TODO Auto-generated method stub
                return Temp != null;
            }

            @Override
            public T next() {
                T val = Temp.data;
                Temp = Temp.next;
                return val;
            }
        };
    }

    // reversal of linked list
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev; 
    }

    // insert class node
    class Node {
        T data;
        Node next;

        Node(T val) {
            data = val;
            next = null;
        }
    }
}
