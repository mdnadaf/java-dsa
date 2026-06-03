public class LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // ================= ADD =================

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void addMiddle(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;

        Node temp = head;

        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // ================= PRINT =================

    public void print() {

        if (head == null) {
            System.out.println("LinkedList is Empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // ================= REMOVE =================

    public int removeFirst() {

        if (size == 0) {
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }

        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;

        return val;
    }

    public int removeLast() {

        if (size == 0) {
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }

        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;

        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;

        return val;
    }

    // ================= SEARCH =================

    public int iterativeSearch(int key) {

        Node temp = head;
        int i = 0;

        while (temp != null) {

            if (temp.data == key) {
                return i;
            }

            temp = temp.next;
            i++;
        }

        return -1;
    }

    // ================= REVERSE =================

    public void reverse() {

        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    // ================= MAIN =================

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        ll.addLast(4);
        ll.addLast(5);

        ll.print(); // 1 -> 2 -> 3 -> 4 -> 5 -> null

        ll.addMiddle(2, 100);
        ll.print(); // 1 -> 2 -> 100 -> 3 -> 4 -> 5 -> null

        ll.removeFirst();
        ll.print(); // 2 -> 100 -> 3 -> 4 -> 5 -> null

        ll.removeLast();
        ll.print(); // 2 -> 100 -> 3 -> 4 -> null

        System.out.println(ll.iterativeSearch(100)); // 1

        ll.reverse();
        ll.print(); // 4 -> 3 -> 100 -> 2 -> null
    }
}