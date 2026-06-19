// Stack Implementation using Array

class Stack {

    // Array to store stack elements
    private int[] arr;

    // Points to the top element of stack
    private int top;

    // Maximum size of stack
    private int capacity;

    // Constructor
    public Stack(int size) {
        capacity = size;
        arr = new int[capacity];

        // Initially stack is empty
        top = -1;
    }

    // Push operation
    public void push(int data) {

        // Check Overflow Condition
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        // Increment top and insert element
        arr[++top] = data;

        System.out.println(data + " pushed into stack");
    }

    // Pop operation
    public int pop() {

        // Check Underflow Condition
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }

        // Store top element
        int value = arr[top];

        // Move top one position back
        top--;

        return value;
    }

    // Peek operation
    public int peek() {

        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return arr[top];
    }

    // Check stack is empty or not
    public boolean isEmpty() {
        return top == -1;
    }

    // Return current size
    public int size() {
        return top + 1;
    }

    // Display stack from top to bottom
    public void display() {

        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.print("Stack Elements: ");

        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}

public class Main {

    public static void main(String[] args) {

        // Create stack of size 5
        Stack st = new Stack(5);

        st.push(10);
        st.push(20);
        st.push(30);

        st.display();

        System.out.println("Top Element : " + st.peek());

        System.out.println("Deleted Element : " + st.pop());

        st.display();

        System.out.println("Current Size : " + st.size());

        System.out.println("Is Empty ? " + st.isEmpty());
    }
}

/*  OUTPUT

10 pushed into stack
20 pushed into stack
30 pushed into stack

Stack Elements: 30 20 10

Top Element : 30

Deleted Element : 30

Stack Elements: 20 10

Current Size : 2

Is Empty ? false
*/

/*
========================================
SUMMARY TABLE
========================================

Operation      Time Complexity
--------------------------------
push()         O(1)
pop()          O(1)
peek()         O(1)
isEmpty()      O(1)
size()         O(1)
display()      O(n)

Overall Space Complexity = O(n)

========================================
INTERVIEW POINT
========================================

Stack follows LIFO
(Last In First Out)

Last inserted element
is removed first.
========================================
*/