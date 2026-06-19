import java.util.Stack;

public class ReverseStringUsingStack {

    public static String reverseString(String str) {

        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        StringBuilder result = new StringBuilder();

        // Pop characters and build reversed string
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String str = "hello";

        String reversed = reverseString(str);

        System.out.println("Original String : " + str);
        System.out.println("Reversed String : " + reversed);
    }
}

/*
========================================
REVERSE STRING USING STACK
========================================

Approach:
1. Push all characters of string into stack.
2. Pop characters one by one.
3. Append popped characters into result string.
4. Result string becomes reversed.

Example:

Input:
"hello"

Stack:
h e l l o

Pop Order:
o l l e h

Output:
"olleh"

Time Complexity:
O(n)

Space Complexity:
O(n)

========================================
*/
