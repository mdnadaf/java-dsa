import java.util.Stack;

public class Sort_A_Stack {

    public static void sortedInsert(Stack<Integer> stack,
                                    int data) {

        if (stack.isEmpty()
                || data > stack.peek()) {

            stack.push(data);
            return;
        }

        int top = stack.pop();

        sortedInsert(stack, data);

        stack.push(top);
    }

    public static void sortStack(Stack<Integer> stack) {

        if (stack.isEmpty()) {
            return;
        }

        int top = stack.pop();

        sortStack(stack);

        sortedInsert(stack, top);
    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        sortStack(stack);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}

/*
========================================
SORT A STACK
========================================

Approach:
1. Pop top element.
2. Recursively sort remaining stack.
3. Insert popped element
   at correct position.

Time Complexity:
O(n²)

Space Complexity:
O(n)

========================================
*/
