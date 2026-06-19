import java.util.Stack;

public class PushAtBottom {

    public static void pushAtBottom(Stack<Integer> s, int data) {

        // Base Case
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        // Step 1: Remove top element
        int top = s.pop();

        // Step 2: Recursively reach bottom
        pushAtBottom(s, data);

        // Step 3: Put removed element back
        s.push(top);
    }

    public static void printStack(Stack<Integer> s) {

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void main(String args[]) {

        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s, 4);

        printStack(s);
    }
}

/*
========================================
PUSH AT BOTTOM OF STACK
========================================

Problem:
Given a Stack and a value,
insert the value at the bottom
of the stack using recursion.

Example:

Stack:
Top
3
2
1

pushAtBottom(4)

Result:
Top
3
2
1
4

Time Complexity:
O(n)

Space Complexity:
O(n)
(Recursive call stack)

========================================
*/
