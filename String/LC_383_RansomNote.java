public class LC_383_RansomNote {

    public static boolean canConstruct(String ransomNote,
                                       String magazine) {

        int[] freq = new int[26];

        for (char ch : magazine.toCharArray()) {
            freq[ch - 'a']++;
        }

        for (char ch : ransomNote.toCharArray()) {

            freq[ch - 'a']--;

            if (freq[ch - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println(
                canConstruct("aa", "aab"));
    }
}

/*
LeetCode 383 - Ransom Note

Example:
Input  : ransomNote = "aa"
         magazine   = "aab"
Output : true

Approach:
1. Count frequency of magazine characters.
2. Traverse ransomNote.
3. Reduce frequency for each character.
4. If any frequency becomes negative,
   return false.
5. Otherwise return true.

Time Complexity  : O(n + m)
Space Complexity : O(1)
*/