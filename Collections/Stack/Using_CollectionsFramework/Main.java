import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        System.out.println("Top Element: "
                           + stack.peek());

        System.out.println("Popped Element: "
                           + stack.pop());

        System.out.println("Stack After Pop: "
                           + stack);

        System.out.println("Size: "
                           + stack.size());

        System.out.println("Is Empty: "
                           + stack.isEmpty());

        System.out.println("Position of 10 from Top: "
                           + stack.search(10));
    }
}

/*
========================================
STACK USING COLLECTION FRAMEWORK
========================================

Class Used:
java.util.Stack

Approach:
- Java Collection Framework ki Stack class use karenge.
- Stack internally LIFO (Last In First Out) follow karta hai.

Important Methods:

push(element)     -> Insert element
pop()             -> Remove top element
peek()            -> View top element
isEmpty()         -> Check stack empty
size()            -> Return size
search(element)   -> Position from top

Time Complexity:

push()      -> O(1)
pop()       -> O(1)
peek()      -> O(1)
isEmpty()   -> O(1)
size()      -> O(1)
search()    -> O(n)

Space Complexity:

O(n)

n = number of elements in stack

========================================
*/