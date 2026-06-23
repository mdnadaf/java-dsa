import java.util.Queue;
import java.util.ArrayDeque;
import java.util.LinkedList;

public class Queue_Using_Collection_Framework {

    public static void main(String[] args) {

       // Queue q = new Queue();
       // Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();

        q.offer(10);  // q.add(10)
        q.offer(20);  // q.add(20)
        q.offer(30);  // q.add(30)

        System.out.println(q.poll());  // q.remove()
        System.out.println(q);           // [20, 30]
        System.out.println(q.peek());  // 20
    }
}

/*
Output:

10
[20, 30]
20

=================================================
QUEUE USING COLLECTION FRAMEWORK
=================================================

Approach:
- Java Queue Interface use karte hain.
- LinkedList Queue implement karti hai.

Methods:

offer() -> insert
poll()  -> remove
peek()  -> front element

Time Complexity:
offer() : O(1)
poll()  : O(1)
peek()  : O(1)

Space Complexity:
O(n)

=================================================
*/