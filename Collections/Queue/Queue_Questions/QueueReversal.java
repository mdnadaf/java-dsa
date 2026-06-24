import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class QueueReversal {

    public static void reverseQueue(Queue<Integer> q) {

        Stack<Integer> stack = new Stack<>();

        // Queue -> Stack
        while(!q.isEmpty()) {

            stack.push(q.poll());
        }

        // Stack -> Queue
        while(!stack.isEmpty()) {

            q.offer(stack.pop());
        }
    }

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);

        System.out.println(
                "Before Reverse : " + q
        );

        reverseQueue(q);

        System.out.println(
                "After Reverse  : " + q
        );
    }
}

/*
=================================================
Output:

Before Reverse : [10, 20, 30, 40]

After Reverse  : [40, 30, 20, 10]

=================================================

Alternative Approach:

Using Recursion

Time  : O(n)
Space : O(n)
*/
