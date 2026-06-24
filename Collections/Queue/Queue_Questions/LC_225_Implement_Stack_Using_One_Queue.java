/*
=================================================
LeetCode 225 : Implement Stack using One Queue
=================================================

Approach:
- Use only one Queue.
- Push new element into queue.
- Rotate previous elements to the back.
- New element becomes front of queue.

Example:

push(1)

Queue:
[1]

--------------------------------

push(2)

Add 2:
[1, 2]

Rotate:

[2, 1]

Top = 2

=================================================

Time Complexity:

push() : O(n)

pop()  : O(1)

top()  : O(1)

empty(): O(1)

=================================================

Space Complexity:

O(n)

n = number of elements

=================================================
*/

import java.util.Queue;
import java.util.LinkedList;

class MyStack {

    Queue<Integer> q;

    public MyStack() {

        q = new LinkedList<>();
    }

    // Push Element
    public void push(int x) {

        q.add(x);

        for(int i = 1; i < q.size(); i++) {

            q.add(q.remove());
        }
    }

    // Remove Top Element
    public int pop() {

        return q.remove();
    }

    // Return Top Element
    public int top() {

        return q.peek();
    }

    // Check Empty
    public boolean empty() {

        return q.isEmpty();
    }
}

public class LC_225_Implement_Stack_Using_One_Queue {

    public static void main(String[] args) {

        MyStack st = new MyStack();

        st.push(1);
        st.push(2);
        st.push(3);

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

Top : 3

Removed : 3

Top : 2

Is Empty : false
-------------------------------------------------

Trick:

After every push,
rotate old elements.

Newest element always remains
at the front of queue.

Therefore:

top() = O(1)
pop() = O(1)

*/