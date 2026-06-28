/*
 * LeetCode 1910 - Remove All Occurrences of a Substring
 * 
 * Approach:
 * - Use a StringBuilder as a stack.
 * - Traverse the input string character by character.
 * - Append each character to the StringBuilder.
 * - After every append, check whether the last 'm' characters
 *   match the given substring 'part'.
 * - If they match, remove those characters immediately.
 *
 * Time Complexity: O(n × m)
 *      n = length of s
 *      m = length of part
 *
 * Space Complexity: O(n)
 *      StringBuilder stores the processed characters.
 */

public class LC_1910_Remove_All_Occurrences_of_a_Substring {

    static class Solution {

        public String removeOccurrences(String s, String part) {

            // StringBuilder acts like a stack
            StringBuilder sb = new StringBuilder();

            // Length of the substring to remove
            int m = part.length();

            // Traverse each character of the input string
            for (char ch : s.toCharArray()) {

                // Push the current character into the stack
                sb.append(ch);

                // Check only if the stack has at least m characters
                if (sb.length() >= m) {

                    boolean match = true;

                    // Compare the last m characters with 'part'
                    for (int i = 0; i < m; i++) {

                        if (sb.charAt(sb.length() - m + i) != part.charAt(i)) {
                            match = false;
                            break;
                        }
                    }

                    // If the last m characters match,
                    // remove them by reducing the StringBuilder length
                    if (match) {
                        sb.setLength(sb.length() - m);
                    }
                }
            }

            // Return the final string
            return sb.toString();
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Sample Test Case 1
        String s1 = "daabcbaabcbc";
        String part1 = "abc";

        System.out.println("Input : " + s1);
        System.out.println("Part  : " + part1);
        System.out.println("Output: " + solution.removeOccurrences(s1, part1));

        System.out.println();

        // Sample Test Case 2
        String s2 = "axxxxyyyyb";
        String part2 = "xy";

        System.out.println("Input : " + s2);
        System.out.println("Part  : " + part2);
        System.out.println("Output: " + solution.removeOccurrences(s2, part2));
    }
}