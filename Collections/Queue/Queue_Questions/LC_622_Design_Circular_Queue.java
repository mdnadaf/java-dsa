/*
=================================================
LeetCode 622 : Design Circular Queue
=================================================

Approach:
- Use Circular Array.
- Front points to first element.
- Rear points to last element.
- Circular movement using modulo (%).

Important Formulas:

Increment:
(index + 1) % capacity

Decrement:
(index - 1 + capacity) % capacity

Full Queue:
size == capacity

Empty Queue:
size == 0

=================================================

Time Complexity:

enQueue() : O(1)
deQueue() : O(1)

Front()   : O(1)
Rear()    : O(1)

isEmpty() : O(1)
isFull()  : O(1)

=================================================

Space Complexity:

O(k)

k = Queue Capacity

=================================================
*/

class MyCircularQueue {

    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public MyCircularQueue(int k) {

        queue = new int[k];

        capacity = k;

        front = 0;
        rear = -1;

        size = 0;
    }

    public boolean enQueue(int value) {

        if (isFull()) {
            return false;
        }

        rear = (rear + 1) % capacity;

        queue[rear] = value;

        size++;

        return true;
    }

    public boolean deQueue() {

        if (isEmpty()) {
            return false;
        }

        front = (front + 1) % capacity;

        size--;

        return true;
    }

    public int Front() {

        if (isEmpty()) {
            return -1;
        }

        return queue[front];
    }

    public int Rear() {

        if (isEmpty()) {
            return -1;
        }

        return queue[rear];
    }

    public boolean isEmpty() {

        return size == 0;
    }

    public boolean isFull() {

        return size == capacity;
    }
}

public class LC_622_Design_Circular_Queue {

    public static void main(String[] args) {

        MyCircularQueue q = new MyCircularQueue(3);

        System.out.println(q.enQueue(1));
        System.out.println(q.enQueue(2));
        System.out.println(q.enQueue(3));

        System.out.println(q.isFull());

        System.out.println(q.Rear());

        System.out.println(q.deQueue());

        System.out.println(q.enQueue(4));

        System.out.println(q.Rear());
    }
}

/*
 * =================================================
 * Output:
 * 
 * true
 * true
 * true
 * true
 * 3
 * true
 * true
 * 4
 * =================================================
 * Interview Notes:
 * 
 * Normal Queue:
 * 
 * enqueue() -> O(1)
 * dequeue() -> O(n)
 * 
 * (shifting required)
 * 
 * =================================================
 * 
 * Circular Queue:
 * 
 * enqueue() -> O(1)
 * dequeue() -> O(1)
 * 
 * (no shifting)
 * 
 * =================================================
 * 
 * Most Important Formula:
 * 
 * rear = (rear + 1) % capacity
 * 
 * front = (front + 1) % capacity
 * 
 * =================================================
 * 
 */