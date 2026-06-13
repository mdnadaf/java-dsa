public class LC_58_LengthOfLastWord {

    public static int lengthOfLastWord(String s) {

        int i = s.length() - 1;

        // Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        int length = 0;

        // Count last word characters
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }

    public static void main(String[] args) {

        String s = "Hello World";

        System.out.println(lengthOfLastWord(s));
    }
}

/*
LeetCode 58 - Length of Last Word

Example:
Input  : "Hello World"
Output : 5

Input  : " fly me to the moon "
Output : 4

Approach:
1. Start from end of string.
2. Skip trailing spaces.
3. Count characters until space is found.
4. Return count.

Time Complexity  : O(n)
Space Complexity : O(1)
*/