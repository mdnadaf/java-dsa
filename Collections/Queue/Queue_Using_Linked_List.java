class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class Queue {

    Node front;
    Node rear;

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int data) {

        Node newNode = new Node(data);

        if(rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    public int dequeue() {

        if(isEmpty()) {
            System.out.println("Queue Empty");
            return -1;
        }

        int value = front.data;

        front = front.next;

        if(front == null) {
            rear = null;
        }

        return value;
    }

    public int peek() {

        if(isEmpty()) {
            return -1;
        }

        return front.data;
    }
}

public class Queue_Using_Linked_List {

    public static void main(String[] args) {

        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue());
        System.out.println(q.peek());
    }
}

/*
Output:

10
20
*/

/*
=================================================
QUEUE USING LINKED LIST
=================================================

Approach:
- front -> first node
- rear  -> last node
- Enqueue at rear.
- Dequeue from front.

Time Complexity:
Enqueue : O(1)
Dequeue : O(1)

Space Complexity:
O(n)

=================================================
*/