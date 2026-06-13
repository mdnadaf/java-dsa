public class LC_409_LongestPalindrome {

    public static int longestPalindrome(String s) {

        int[] freq = new int[128];

        for (char ch : s.toCharArray()) {
            freq[ch]++;
        }

        int length = 0;

        for (int count : freq) {

            length += (count / 2) * 2;

            if (length % 2 == 0 && count % 2 == 1) {
                length++;
            }
        }

        return length;
    }

    public static void main(String[] args) {

        String s = "abccccdd";

        System.out.println(longestPalindrome(s));
    }
}

/*
LeetCode 409 - Longest Palindrome

Example:
Input  : "abccccdd"
Output : 7

Explanation:
Possible palindrome = "dccaccd"

Approach:
1. Count frequency of each character.
2. Add all even frequency counts.
3. For odd frequencies, add count - 1.
4. If any odd frequency exists, place one character in center.
5. Return maximum palindrome length.

Time Complexity  : O(n)
Space Complexity : O(1)
*/