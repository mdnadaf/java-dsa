import java.util.HashSet;

public class LC_3_LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {

        // Stores unique characters in current window
        HashSet<Character> set = new HashSet<>();

        int left = 0;          // Start of window
        int maxLength = 0;     // Stores maximum length

        // Expand window using right pointer
        for (int right = 0; right < s.length(); right++) {

            // If duplicate character found,
            // shrink window from left side
            while (set.contains(s.charAt(right))) {

                set.remove(s.charAt(left));
                left++;
            }

            // Add current character
            set.add(s.charAt(right));

            // Update maximum length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        String s = "abcabcbb";

        int result = lengthOfLongestSubstring(s);

        System.out.println(
                "Longest Substring Length = " + result);
    }
}

// Time Complexity  : O(n)
// Space Complexity : O(n)