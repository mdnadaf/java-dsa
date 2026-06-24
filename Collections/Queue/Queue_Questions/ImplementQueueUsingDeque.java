/*
=================================================
IMPLEMENT QUEUE USING DEQUE
=================================================

Approach:
- Use Deque as Queue.
- Insert from Rear.
- Delete from Front.

Queue follows:

FIFO
(First In First Out)

Deque Methods Used:

addLast()     -> enqueue
removeFirst() -> dequeue
peekFirst()   -> front

=================================================

Time Complexity:

enqueue() : O(1)

dequeue() : O(1)

peek()    : O(1)

empty()   : O(1)

=================================================

Space Complexity:

O(n)

n = number of elements

=================================================
*/

import java.util.Deque;
import java.util.ArrayDeque;

class MyQueue {

    private Deque<Integer> deque;

    public MyQueue() {

        deque = new ArrayDeque<>();
    }

    // Insert Element
    public void enqueue(int data) {

        deque.addLast(data);
    }

    // Remove Front Element
    public int dequeue() {

        if (empty()) {

            System.out.println("Queue Empty");
            return -1;
        }

        return deque.removeFirst();
    }

    // Return Front Element
    public int peek() {

        if (empty()) {

            System.out.println("Queue Empty");
            return -1;
        }

        return deque.peekFirst();
    }

    // Check Empty
    public boolean empty() {

        return deque.isEmpty();
    }
}

public class ImplementQueueUsingDeque {

    public static void main(String[] args) {

        MyQueue q = new MyQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Front : " + q.peek());

        System.out.println("Removed : " + q.dequeue());

        System.out.println("Front : " + q.peek());

        System.out.println("Is Empty : " + q.empty());
    }
}

/*
 * =================================================
 * Output:
 * 
 * Front : 10
 * 
 * Removed : 10
 * 
 * Front : 20
 * 
 * Is Empty : false
 * =================================================
 * Interview Notes:
 * 
 * Queue:
 * 
 * FIFO
 * First In First Out
 * 
 * =================================================
 * 
 * Deque:
 * 
 * Double Ended Queue
 * 
 * Can insert/delete from:
 * 
 * Front
 * Rear
 * 
 * =================================================
 * 
 * Queue Mapping:
 * 
 * enqueue() -> addLast()
 * 
 * dequeue() -> removeFirst()
 * 
 * peek() -> peekFirst()
 * 
 * =================================================
 * 
 * Modern Java Preference:
 * 
 * Instead of:
 * 
 * Queue<Integer> q =
 * new LinkedList<>();
 * 
 * Use:
 * 
 * Deque<Integer> q =
 * new ArrayDeque<>();
 * 
 * Reason:
 * 
 * 1. Faster
 * 2. No extra node memory
 * 3. Recommended by Java Docs
 * 
 * =================================================
 */