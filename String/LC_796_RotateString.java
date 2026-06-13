public class LC_796_RotateString {

    public static boolean rotateString(String s,String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        return (s + s).contains(goal);
    }

    public static void main(String[] args) {

        System.out.println(
                rotateString("abcde", "cdeab"));
    }
}

/*
LeetCode 796 - Rotate String

Example:
Input  : s = "abcde"
         goal = "cdeab"
Output : true

Approach:
1. Lengths must be equal.
2. Concatenate s with itself.
3. Check if goal exists in (s + s).
4. If yes, return true.

Time Complexity  : O(n)
Space Complexity : O(n)
*/