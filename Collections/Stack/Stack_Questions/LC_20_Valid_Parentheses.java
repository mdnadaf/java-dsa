import java.util.Stack;

class LC_20_Valid_Parentheses {

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()) {

            if(ch == '(') stack.push(')');
            else if(ch == '{') stack.push('}');
            else if(ch == '[') stack.push(']');
            else {
                if(stack.isEmpty() || stack.pop() != ch) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    // Driver Code
    public static void main(String[] args) {

        String s = "()[]{}";

        System.out.println(isValid(s));
    }
}


/*
Output:

true

Dry Run:

Input:
([])

( -> push )
Stack: )

[ -> push ]
Stack: ) ]

] -> pop ]
Match

) -> pop )
Match

Stack Empty

Return true

=================================================
Interview Note:

Stack follows LIFO.
Last Opened Bracket
must be closed first.

=================================================

/*
=================================================
LeetCode 20 : Valid Parentheses
=================================================

Approach:
1. Opening bracket mile to expected closing
   bracket stack me push karo.
2. Closing bracket mile to stack top se compare karo.
3. Match na ho to false return karo.
4. End me stack empty hona chahiye.

Time Complexity:
O(n)

Space Complexity:
O(n)

Example:

Input:
()[]{}

Output:
true

=================================================
*/


