class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {

    private Node top;
    private int size;

    public Stack() {
        top = null;
        size = 0;
    }

    public void push(int data) {

        Node newNode = new Node(data);

        newNode.next = top;
        top = newNode;

        size++;

        System.out.println(data + " pushed into stack");
    }

    public int pop() {

        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int poppedElement = top.data;

        top = top.next;

        size--;

        return poppedElement;
    }

    public int peek() {

        if (isEmpty()) {
            System.out.println("Stack Empty");
            return -1;
        }

        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

    public void display() {

        if (isEmpty()) {
            System.out.println("Stack Empty");
            return;
        }

        Node temp = top;

        System.out.print("Stack: ");

        while (temp != null) {

            System.out.print(temp.data + " ");

            temp = temp.next;
        }

        System.out.println();
    }
}

public class Main {

    public static void main(String[] args) {

        Stack st = new Stack();

        st.push(10);
        st.push(20);
        st.push(30);

        st.display();

        System.out.println("Top Element: " + st.peek());

        System.out.println("Popped Element: " + st.pop());

        st.display();

        System.out.println("Size: " + st.size());

        System.out.println("Is Empty: " + st.isEmpty());
    }
}

/*
========================================
STACK USING LINKED LIST
========================================

Approach:
- Linked List ka use karke Stack implement kiya hai.
- Head node ko Top mana gaya hai.
- push() -> Beginning me insert.
- pop()  -> Beginning se delete.
- peek() -> Head node return.

Time Complexity:

push()      -> O(1)
pop()       -> O(1)
peek()      -> O(1)
isEmpty()   -> O(1)
size()      -> O(1)
display()   -> O(n)

Space Complexity:

O(n)

n = number of elements in stack.

Advantages:
1. Dynamic Size
2. No Overflow (until memory is available)
3. No need to define capacity

========================================
*/
