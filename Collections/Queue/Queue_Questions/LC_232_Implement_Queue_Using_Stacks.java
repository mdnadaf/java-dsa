import java.util.Stack;

class MyQueue {

    private Stack<Integer> inputStack;
    private Stack<Integer> outputStack;

    public MyQueue() {

        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }

    // Enqueue
    public void push(int x) {

        inputStack.push(x);
    }

    // Dequeue
    public int pop() {

        moveElements();

        return outputStack.pop();
    }

    // Front Element
    public int peek() {

        moveElements();

        return outputStack.peek();
    }

    // Check Empty
    public boolean empty() {

        return inputStack.isEmpty()
                && outputStack.isEmpty();
    }

    // Transfer elements only when needed
    private void moveElements() {

        if(outputStack.isEmpty()) {

            while(!inputStack.isEmpty()) {

                outputStack.push(
                        inputStack.pop()
                );
            }
        }
    }
}

public class LC_232_Implement_Queue_Using_Stacks {

    public static void main(String[] args) {

        MyQueue q = new MyQueue();

        q.push(10);
        q.push(20);
        q.push(30);

        System.out.println(
                "Front : " + q.peek()
        );

        System.out.println(
                "Removed : " + q.pop()
        );

        System.out.println(
                "Front : " + q.peek()
        );

        System.out.println(
                "Is Empty : " + q.empty()
        );
    }
}

/*
=================================================
Output:

Front : 10

Removed : 10

Front : 20

Is Empty : false

/*
=================================================
LeetCode 232 : Implement Queue using Stacks
=================================================

Approach:
- Use two stacks:
  1. inputStack
  2. outputStack

Enqueue (push):
- Insert element into inputStack.

Dequeue (pop):
- If outputStack is empty,
  move all elements from inputStack
  to outputStack.
- Pop from outputStack.

Peek:
- If outputStack is empty,
  transfer elements first.
- Return top of outputStack.

Why?

Queue = FIFO
Stack = LIFO

Using two stacks,
double reversal gives FIFO behavior.

=================================================

Time Complexity:

push()  : O(1)

pop()   : O(1) Amortized

peek()  : O(1) Amortized

empty() : O(1)

=================================================

Space Complexity:

O(n)

n = number of elements

=================================================
Interview Notes:

Queue follows:

FIFO
(First In First Out)

--------------------------------

Stack follows:

LIFO
(Last In First Out)

--------------------------------

Two stacks create FIFO behavior:

Input Stack:

10 20 30

↓

Transfer

↓

Output Stack:

30 20 10

Now pop() removes 10 first.

*/