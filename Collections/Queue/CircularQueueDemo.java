class CircularQueue {

    int arr[];
    int size;
    int front;
    int rear;

    CircularQueue(int n) {

        arr = new int[n];
        size = n;

        front = -1;
        rear = -1;
    }

    public boolean isEmpty() {

        return front == -1 && rear == -1;
    }

    public boolean isFull() {

        return (rear + 1) % size == front;
    }

    public void enqueue(int data) {

        if(isFull()) {

            System.out.println("Queue Full");
            return;
        }

        // First Element
        if(front == -1) {
            front = 0;
        }

        rear = (rear + 1) % size;

        arr[rear] = data;
    }

    public int dequeue() {

        if(isEmpty()) {

            System.out.println("Queue Empty");
            return -1;
        }

        int result = arr[front];

        // Single Element
        if(front == rear) {

            front = rear = -1;
        }
        else {

            front = (front + 1) % size;
        }

        return result;
    }

    public int peek() {

        if(isEmpty()) {

            System.out.println("Queue Empty");
            return -1;
        }

        return arr[front];
    }
}

public class CircularQueueDemo {

    public static void main(String[] args) {

        CircularQueue q = new CircularQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Removed : "
                + q.dequeue());

        q.enqueue(40);
        q.enqueue(50);

        System.out.println("Front : "
                + q.peek());
    }
}

/*
=================================================
Output:

Removed : 10

Front : 20

/*
=================================================
CIRCULAR QUEUE USING ARRAY
=================================================

Approach:
- Circular Queue uses array efficiently.
- Rear reaches end and starts again from index 0.
- Wastage of space is avoided.
- Front points to first element.
- Rear points to last element.

Conditions:

Empty Queue:
front == -1 && rear == -1

Full Queue:
(rear + 1) % size == front

=================================================

Time Complexity:

enqueue() : O(1)
dequeue() : O(1)
peek()    : O(1)
isEmpty() : O(1)

=================================================

Space Complexity:

O(n)

n = size of queue

=================================================

=================================================
Interview Notes:

Normal Queue:

enqueue() -> O(1)
dequeue() -> O(n)

Reason:
Elements shift after deletion.

--------------------------------

Circular Queue:

enqueue() -> O(1)
dequeue() -> O(1)

No shifting required.

--------------------------------

Most Important Formula:

Full Queue:

(rear + 1) % size == front

=================================================
*/