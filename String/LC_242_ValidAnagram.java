public class LC_242_ValidAnagram {

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s, t));
    }
}

/*
LeetCode 242 - Valid Anagram

Example:
Input  : s = "anagram", t = "nagaram"
Output : true

Approach:
1. If lengths are different, return false.
2. Count frequencies using an array.
3. Increment for s and decrement for t.
4. If all frequencies become zero, strings are anagrams.

Time Complexity  : O(n)
Space Complexity : O(1)
*/