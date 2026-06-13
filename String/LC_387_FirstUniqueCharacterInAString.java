public class LC_387_FirstUniqueCharacterInAString {

    public static int firstUniqChar(String s) {

        int[] freq = new int[26];

        // Count frequency
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        // Find first unique character
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        String s = "leetcode";

        System.out.println(firstUniqChar(s));
    }
}

/*
LeetCode 387 - First Unique Character in a String

Example:
Input  : "leetcode"
Output : 0

Input  : "loveleetcode"
Output : 2

Approach:
1. Count frequency of each character.
2. Traverse string again.
3. Return first index whose frequency is 1.

Time Complexity  : O(n)
Space Complexity : O(1)
*/