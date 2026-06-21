import java.util.Stack;

class LC_844_Backspace_String_Compare {

    public static String buildString(String str) {

        Stack<Character> stack = new Stack<>();

        for(char ch : str.toCharArray()) {

            if(ch != '#') {
                stack.push(ch);
            }
            else if(!stack.isEmpty()) {
                stack.pop();
            }
        }

        StringBuilder sb = new StringBuilder();

        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }

    public static boolean backspaceCompare(String s, String t) {

        String s1 = buildString(s);
        String s2 = buildString(t);

        return s1.equals(s2);
    }

    // Driver Code
    public static void main(String[] args) {

        String s = "ab#c";
        String t = "ad#c";

        System.out.println(backspaceCompare(s, t)
        );
    }
}

/*
=================================================
LeetCode 844 : Backspace String Compare
=================================================

Approach:
1. Traverse string character by character.
2. If character is not '#', push into stack.
3. If character is '#', remove top element.
4. Build final string from stack.
5. Compare both processed strings.

Time Complexity:
O(n + m)

Space Complexity:
O(n + m)

Example:

Input:
s = "ab#c"
t = "ad#c"

Output:
true

=================================================
*/
