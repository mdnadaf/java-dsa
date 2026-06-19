import java.util.Stack;

public class Delete_Middle_Element_Of_Stack {

    public static void deleteMiddle(Stack<Integer> stack,int current,int size) {

        if (current == size / 2) {
            stack.pop();
            return;
        }

        int top = stack.pop();

        deleteMiddle(stack,
                     current + 1,
                     size);

        stack.push(top);
    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        deleteMiddle(stack, 0, stack.size());

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}

/*
========================================
DELETE MIDDLE ELEMENT OF STACK
========================================

Approach:
1. Find middle position.
2. Recursively pop elements.
3. Skip middle element.
4. Push remaining elements back.

Time Complexity:
O(n)

Space Complexity:
O(n)

========================================
*/