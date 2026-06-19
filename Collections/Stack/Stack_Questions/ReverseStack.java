import java.util.Stack;

public class ReverseStack {

    public static void pushAtBottom(Stack<Integer> stack, int data) {

        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }

        int top = stack.pop();

        pushAtBottom(stack, data);

        stack.push(top);
    }

    public static void reverseStack(Stack<Integer> stack) {

        if (stack.isEmpty()) {
            return;
        }

        int top = stack.pop();

        reverseStack(stack);

        pushAtBottom(stack, top);
    }

    public static void printStack(Stack<Integer> stack) {

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        reverseStack(stack);

        System.out.println("Reversed Stack:");

        printStack(stack);
    }
}

/*
========================================
REVERSE A STACK USING RECURSION
========================================

Approach:
1. Pop top element.
2. Recursively reverse remaining stack.
3. Insert popped element at bottom.
4. Repeat until stack is reversed.

Example:

Original Stack:

Top
4
3
2
1

Reversed Stack:

Top
1
2
3
4

Time Complexity:
O(n²)

Space Complexity:
O(n)

Reason:
- reverseStack() called n times.
- pushAtBottom() takes O(n) time.

========================================
*/
