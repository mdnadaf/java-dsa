import java.util.ArrayList;

class Queue {

    private ArrayList<Integer> list;

    public Queue() {
        list = new ArrayList<>();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void enqueue(int data) {

        list.add(data);
    }

    public int dequeue() {

        if(isEmpty()) {
            System.out.println("Queue Empty");
            return -1;
        }

        return list.remove(0);
    }

    public int peek() {

        if(isEmpty()) {
            System.out.println("Queue Empty");
            return -1;
        }

        return list.get(0);
    }

    public int size() {
        return list.size();
    }
}

public class Queue_Using_ArrayList {

    public static void main(String[] args) {

        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Removed : " + q.dequeue());

        System.out.println("Front : " + q.peek());

        System.out.println("Size : " + q.size());
    }
}

/*
=================================================
Output:

Removed : 10

Front : 20

Size : 2

=================================================
QUEUE USING ARRAYLIST
=================================================

Approach:
- ArrayList ka use karke Queue implement kiya hai.
- Enqueue -> Rear (end) me insert.
- Dequeue -> Front (index 0) se remove.
- Peek -> Front element return.

Queue follows FIFO:
First In First Out

Example:

Enqueue:
10 20 30

Front -> 10

Dequeue:

10 remove hoga pehle.

=================================================

Time Complexity:

enqueue() : O(1)
dequeue() : O(n)
peek()    : O(1)
isEmpty() : O(1)

=================================================

Space Complexity:

O(n)

n = number of elements

=================================================
*/