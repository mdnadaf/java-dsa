import java.util.Queue;
import java.util.LinkedList;

class MyStack {

    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public MyStack() {

        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    // Push Element
    public void push(int data) {

        q2.offer(data);

        while(!q1.isEmpty()) {

            q2.offer(q1.poll());
        }

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // Pop Element
    public int pop() {

        if(empty()) {

            System.out.println("Stack Empty");
            return -1;
        }

        return q1.poll();
    }

    // Top Element
    public int top() {

        if(empty()) {

            System.out.println("Stack Empty");
            return -1;
        }

        return q1.peek();
    }

    // Check Empty
    public boolean empty() {

        return q1.isEmpty();
    }
}

public class StackUsingTwoQueues {

    public static void main(String[] args) {

        MyStack st = new MyStack();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println(
                "Top : " + st.top()
        );

        System.out.println(
                "Removed : " + st.pop()
        );

        System.out.println(
                "Top : " + st.top()
        );

        System.out.println(
                "Is Empty : " + st.empty()
        );
    }
}

/*
=================================================
Output:

Top : 30

Removed : 30

Top : 20

Is Empty : false

/*
=================================================
STACK USING TWO QUEUES
=================================================

Approach:
- Use two queues:
  1. q1
  2. q2

Push:
1. Add new element to q2.
2. Move all elements from q1 to q2.
3. Swap q1 and q2.

Pop:
- Remove from q1.

Peek:
- Return front of q1.

Why?

Queue = FIFO
Stack = LIFO

By rearranging elements during push,
front of q1 always becomes stack top.

=================================================

Time Complexity:

push() : O(n)

pop()  : O(1)

peek() : O(1)

empty(): O(1)

=================================================

Space Complexity:

O(n)

n = number of elements

=================================================
*/

