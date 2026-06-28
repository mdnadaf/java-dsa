/*
=================================================
LeetCode 641 : Design Circular Deque
=================================================

Approach:
- Use Circular Array.
- Front and Rear move circularly.
- Insert/Delete possible from both ends.

################################################

    increment ==>> (rear+1)%size
    decrement ==>> (rear-1+size)%size

    | Operation    | Pointer Move | Formula                                     |
| ------------ | ------------ | ------------------------------------------- |
| Insert Front | ⬅️ Peeche    | `front = (front - 1 + capacity) % capacity` |
| Insert Rear  | ➡️ Aage      | `rear = (rear + 1) % capacity`              |
| Delete Front | ➡️ Aage      | `front = (front + 1) % capacity`            |
| Delete Rear  | ⬅️ Peeche    | `rear = (rear - 1 + capacity) % capacity`   |

#################################################

Operations: & Time Complexity:

insertFront() : O(1)
insertLast()  : O(1)

deleteFront() : O(1)
deleteLast()  : O(1)

getFront()    : O(1)
getRear()     : O(1)

isEmpty()     : O(1)
isFull()      : O(1)

=================================================

Space Complexity:

O(k)

k = capacity of deque

=================================================
*/

class MyCircularDeque {

    private int[] deque;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public MyCircularDeque(int k) {

        deque = new int[k];

        capacity = k;

        front = 0;
        rear = k - 1;

        size = 0;
    }

    public boolean insertFront(int value) {

        if (isFull()) {
            return false;
        }

        front = (front - 1 + capacity) % capacity;

        deque[front] = value;

        size++;

        return true;
    }

    public boolean insertLast(int value) {

        if (isFull()) {
            return false;
        }

        rear = (rear + 1) % capacity;

        deque[rear] = value;

        size++;

        return true;
    }

    public boolean deleteFront() {

        if (isEmpty()) {
            return false;
        }

        front = (front + 1) % capacity;

        size--;

        return true;
    }

    public boolean deleteLast() {

        if (isEmpty()) {
            return false;
        }

        rear = (rear - 1 + capacity) % capacity;

        size--;

        return true;
    }

    public int getFront() {

        if (isEmpty()) {
            return -1;
        }

        return deque[front];
    }

    public int getRear() {

        if (isEmpty()) {
            return -1;
        }

        return deque[rear];
    }

    public boolean isEmpty() {

        return size == 0;
    }

    public boolean isFull() {

        return size == capacity;
    }
}

public class LC_641_Design_Circular_Deque {

    public static void main(String[] args) {

        MyCircularDeque dq = new MyCircularDeque(3);

        System.out.println(dq.insertLast(1));

        System.out.println(dq.insertLast(2));

        System.out.println(dq.insertFront(3));

        System.out.println(dq.getRear());

        System.out.println(dq.isFull());

        System.out.println(dq.deleteLast());

        System.out.println(dq.insertFront(4));

        System.out.println(dq.getFront());
    }
}

/*
 * =================================================
 * Output:
 * 
 * true
 * true
 * true
 * 2
 * true
 * true
 * true
 * 4
 * 
 * =================================================
 * Dry Run:
 * 
 * Capacity = 3
 * 
 * --------------------------------
 * 
 * insertLast(1)
 * 
 * [1]
 * 
 * --------------------------------
 * 
 * insertLast(2)
 * 
 * [1, 2]
 * 
 * --------------------------------
 * 
 * insertFront(3)
 * 
 * [3, 1, 2]
 * 
 * --------------------------------
 * 
 * getRear()
 * 
 * 2
 * 
 * --------------------------------
 * 
 * isFull()
 * 
 * true
 * 
 * --------------------------------
 * 
 * deleteLast()
 * 
 * [3, 1]
 * 
 * --------------------------------
 * 
 * insertFront(4)
 * 
 * [4, 3, 1]
 * 
 * --------------------------------
 * 
 * getFront()
 * 
 * 4
 * 
 * =================================================
 * Interview Notes:
 * 
 * Deque:
 * 
 * Double Ended Queue
 * 
 * Insertion:
 * Front + Rear
 * 
 * Deletion:
 * Front + Rear
 * 
 * =================================================
 * 
 * Queue:
 * 
 * Insert Rear
 * Delete Front
 * 
 * =================================================
 * 
 * Deque:
 * 
 * Insert Front + Rear
 * Delete Front + Rear
 */