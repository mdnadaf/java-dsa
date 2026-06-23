import java.util.Stack;

class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    // Constructor
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    // Push element onto stack
    public void push(int value) {

        stack.push(value);

        // Push into minStack if it is the first element
        // or smaller/equal to current minimum
        if (minStack.isEmpty() || value <= minStack.peek()) {
            minStack.push(value);
        }
    }

    // Remove top element
    public void pop() {

        if (stack.isEmpty()) {
            System.out.println("Stack is Empty!");
            return;
        }

        int top = stack.pop();

        // Remove from minStack if popped element
        // was the current minimum
        if (top == minStack.peek()) {
            minStack.pop();
        }
    }

    // Return top element
    public int top() {
        return stack.peek();
    }

    // Return minimum element
    public int getMin() {
        return minStack.peek();
    }
}

public class LC_155_Min_Stack {

    public static void main(String[] args) {

        MinStack ms = new MinStack();

        ms.push(5);
        ms.push(3);
        ms.push(7);
        ms.push(2);

        System.out.println("Current Min : " + ms.getMin());

        ms.pop();

        System.out.println("Top Element : " + ms.top());
        System.out.println("Current Min : " + ms.getMin());
    }
}