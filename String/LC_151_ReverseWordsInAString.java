public class LC_151_ReverseWordsInAString {

    public static String reverseWords(String s) {

        String[] words = s.trim().split("\\s+");

        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {

            result.append(words[i]);

            if (i > 0) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String s = "the sky is blue";

        System.out.println(reverseWords(s));
    }
}


/*
LeetCode 151 - Reverse Words in a String

Example:
Input  : "the sky is blue"
Output : "blue is sky the"

Input  : "  hello world  "
Output : "world hello"

Approach:
1. Remove leading and trailing spaces using trim().
2. Split string into words using "\\s+".
3. Traverse words array from end to start.
4. Append words into StringBuilder.
5. Return final reversed string.

Time Complexity  : O(n)
Space Complexity : O(n)
*/
