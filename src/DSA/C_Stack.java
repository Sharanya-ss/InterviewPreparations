package DSA;


class LinkedListStack<T> {
    Node head;

    public LinkedListStack() {
        head = null;
    }

    // insert at beginning for push
    public void push(T val) {
        Node newNode = new Node(val);
        if (head == null) { // if list is empty
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // remove from beginning for pop
    public T pop() {
        if (head == null) {
            throw new IndexOutOfBoundsException("list is empty");
        }

        T temp;
        if (head.next == null) {
            temp = head.data;
            head = null;
        } else {
            temp = head.data;
            head = head.next;
        }

        return temp;
    }

    // peek the data on the top
    public T peek() {
        T temp = head.data;
        return temp;
    }

    class Node {
        T data;
        Node next;

        Node(T val) {
            data = val;
            next = null;
        }
    }
}


public class C_Stack {
	public static void main(String[] args) {
		
	}

}
