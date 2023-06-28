
public class LinkedListT<T extends Comparable<T>> {
    private Node head;
    private Node tail;
    private int size;

    public void add(T value) {
        Node newNode = new Node();
        newNode.value = value;
        if (head == null) {
            head = newNode;
            tail = newNode;
            size = 1;
            return;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            size++;
        }
    }

    public void revers() {
        Node currentNode = head;
        while (currentNode != null) {
            Node next = currentNode.next;
            Node prev = currentNode.prev;
            currentNode.next = prev;
            currentNode.prev = next;
            if (prev == null) {
                tail = currentNode;
            }
            if (next == null) {
                head = currentNode;
            }
            currentNode = next;

        }
    }

    public void print() {
        System.out.print("[ ");
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
        System.out.printf("] \n");
    }

    private class Node {
        public T value;
        public Node next;
        public Node prev;

        public Node() {
            T value;
            Node next;
            Node prev;

        }

        public Node(T _value, Node _next, Node _prev) {
            this.value = _value;
            this.next = _next;
            this.prev = _prev;
        }
    }
}