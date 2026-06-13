public class LC_392_IsSubsequence {

    public static boolean isSubsequence(String s, String t) {

        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {

            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }

            j++;
        }

        return i == s.length();
    }

    public static void main(String[] args) {

        String s = "abc";
        String t = "ahbgdc";

        System.out.println(isSubsequence(s, t));
    }
}

/*
LeetCode 392 - Is Subsequence

Example:
Input  : s = "abc"
         t = "ahbgdc"
Output : true

Input  : s = "axc"
         t = "ahbgdc"
Output : false

Approach:
1. Use two pointers.
2. Traverse both strings.
3. If characters match, move pointer of s.
4. Always move pointer of t.
5. If all characters of s are matched,
   return true.

Time Complexity  : O(n + m)

Space Complexity : O(1)

where:
n = length of s
m = length of t
*/