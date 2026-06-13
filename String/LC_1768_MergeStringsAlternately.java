public class LC_1768_MergeStringsAlternately {

    public static String mergeAlternately(
            String word1,
            String word2) {

        StringBuilder sb = new StringBuilder();

        int i = 0;
        int j = 0;

        while (i < word1.length()
                && j < word2.length()) {

            sb.append(word1.charAt(i++));
            sb.append(word2.charAt(j++));
        }

        while (i < word1.length()) {
            sb.append(word1.charAt(i++));
        }

        while (j < word2.length()) {
            sb.append(word2.charAt(j++));
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        System.out.println(
                mergeAlternately("abc", "pqr"));
    }
}

/*
LeetCode 1768 - Merge Strings Alternately

Example:
Input  : word1 = "abc"
         word2 = "pqr"
Output : "apbqcr"

Approach:
1. Use two pointers.
2. Append one character from each string.
3. Continue until one string ends.
4. Append remaining characters.
5. Return merged string.

Time Complexity  : O(n + m)
Space Complexity : O(n + m)
*/