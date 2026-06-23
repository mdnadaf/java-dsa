class Queue {

    int arr[];
    int size;
    int rear;

    Queue(int n) {
        arr = new int[n];
        size = n;
        rear = -1;
    }

    public boolean isEmpty() {
        return rear == -1;
    }

    public void enqueue(int data) {

        if(rear == size - 1) {
            System.out.println("Queue Full");
            return;
        }

        arr[++rear] = data;
    }

    public int dequeue() {

        if(isEmpty()) {
            System.out.println("Queue Empty");
            return -1;
        }

        int front = arr[0];

        for(int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }

        rear--;

        return front;
    }

    public int peek() {

        if(isEmpty()) {
            return -1;
        }

        return arr[0];
    }
}

public class Queue_Using_Array {

    public static void main(String[] args) {

        Queue q = new Queue(5);

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
QUEUE USING ARRAY
=================================================

Approach:
- front points to first element.
- rear points to last element.
- Enqueue -> insert at rear.
- Dequeue -> remove from front.

Time Complexity:
Enqueue : O(1)
Dequeue : O(n)

Space Complexity:
O(n)

=================================================
*/
