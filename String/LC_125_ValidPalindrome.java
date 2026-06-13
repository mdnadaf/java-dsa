public class LC_125_ValidPalindrome {

    public static boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            // Skip non-alphanumeric characters
            while (left < right &&
                    !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            // Skip non-alphanumeric characters
            while (left < right &&
                    !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare characters ignoring case
            if (Character.toLowerCase(s.charAt(left))
                    != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrome(s));
    }
}

/*
LeetCode 125 - Valid Palindrome

Example:
Input  : "A man, a plan, a canal: Panama"
Output : true

Approach:
1. Use two pointers.
2. Ignore non-alphanumeric characters.
3. Compare characters after converting to lowercase.
4. If mismatch found, return false.

Time Complexity  : O(n)
Space Complexity : O(1)
*/