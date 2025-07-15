package DSA;


class Queue<T> {
    // Using linked list is efficient, so use this always in queue implementation

    // variables declaration
    Node front, rear;

    // constructor
    Queue() {
        front = null;
        rear = null;
    }

    // enqueue – adding node to last of the list
    public void enqueue(T val) {
        Node newNode = new Node(val);
        if (front == null) { // list is null
            front = newNode;
        } else { // list has some value
            rear.next = newNode;
        }
        rear = newNode;
    }

    // dequeue – removing value from front of the list
    public T dequeue() {
        if (front == null) {
            throw new IndexOutOfBoundsException("list is empty");
        }

        T del = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        return del;
    }

    // Node class
    class Node {
        T data;
        Node next;

        Node(T val) {
            data = val;
            next = null;
        }
    }
}
public class C_Queue {
	public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
