import java.util.ArrayList;


// Stack using ArrayList
class Stack {

    private ArrayList<Integer> list;

    public Stack() {
        list = new ArrayList<>();
    }

    public void push(int data) {
        list.add(data);
        System.out.println(data + " pushed into stack");
    }

    public int pop() {

        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }

        return list.remove(list.size() - 1);
    }

    public int peek() {

        if (isEmpty()) {
            System.out.println("Stack Empty");
            return -1;
        }

        return list.get(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public void display() {

        if (isEmpty()) {
            System.out.println("Stack Empty");
            return;
        }

        System.out.print("Stack: ");

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
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
STACK USING ARRAYLIST
========================================

Approach:
- ArrayList ka use karke Stack implement kiya hai.
- Last element ko Top mana gaya hai.

Time Complexity:

push()      -> O(1)
pop()       -> O(1)
peek()      -> O(1)
isEmpty()   -> O(1)
size()      -> O(1)
display()   -> O(n)

Space Complexity:

O(n)

n = number of elements present in stack.

========================================
*/