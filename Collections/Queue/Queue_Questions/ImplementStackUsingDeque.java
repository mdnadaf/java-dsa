/*
=================================================
IMPLEMENT STACK USING DEQUE
=================================================

Approach:
- Use Deque as Stack.
- Insert and delete from front.

Stack follows:

LIFO
(Last In First Out)

Deque Methods Used:

addFirst()    -> push
removeFirst() -> pop
peekFirst()   -> top

=================================================

Time Complexity:

push()  : O(1)

pop()   : O(1)

top()   : O(1)

empty() : O(1)

=================================================

Space Complexity:

O(n)

n = number of elements

=================================================
*/

import java.util.Deque;
import java.util.ArrayDeque;

class MyStack {

    private Deque<Integer> deque;

    public MyStack() {

        deque = new ArrayDeque<>();
    }

    // Push Element
    public void push(int data) {

        deque.addFirst(data);
    }

    // Remove Top Element
    public int pop() {

        if (empty()) {

            System.out.println("Stack Empty");
            return -1;
        }

        return deque.removeFirst();
    }

    // Return Top Element
    public int top() {

        if (empty()) {

            System.out.println("Stack Empty");
            return -1;
        }

        return deque.peekFirst();
    }

    // Check Empty
    public boolean empty() {

        return deque.isEmpty();
    }
}

public class ImplementStackUsingDeque {

    public static void main(String[] args) {

        MyStack st = new MyStack();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println(
                "Top : " + st.top());

        System.out.println(
                "Removed : " + st.pop());

        System.out.println(
                "Top : " + st.top());

        System.out.println(
                "Is Empty : " + st.empty());
    }
}

/*
 * =================================================
 * Output:
 * 
 * Top : 30
 * 
 * Removed : 30
 * 
 * Top : 20
 * 
 * Is Empty : false
 * 
 * =================================================
 * Dry Run:
 * 
 * push(10)
 * 
 * Deque:
 * 
 * [10]
 * 
 * --------------------------------
 * 
 * push(20)
 * 
 * Deque:
 * 
 * [20, 10]
 * 
 * --------------------------------
 * 
 * push(30)
 * 
 * Deque:
 * 
 * [30, 20, 10]
 * 
 * --------------------------------
 * 
 * top()
 * 
 * 30
 * 
 * --------------------------------
 * 
 * pop()
 * 
 * Remove 30
 * 
 * Deque:
 * 
 * [20, 10]
 * 
 * =================================================
 * Interview Notes:
 * 
 * Stack:
 * 
 * LIFO
 * Last In First Out
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
 * Stack Mapping:
 * 
 * push() -> addFirst()
 * 
 * pop() -> removeFirst()
 * 
 * top() -> peekFirst()
 * 
 * =================================================
 * 
 * Modern Java Preference:
 * 
 * Instead of:
 * 
 * Stack<Integer> st = new Stack<>();
 * 
 * Use:
 * 
 * Deque<Integer> st = new ArrayDeque<>();
 * 
 * Reason:
 * 
 * 1. Faster
 * 2. Non-Synchronized
 * 3. Recommended by Java Docs
 * 
 * =================================================
 */