public class LC_345_ReverseVowelsOfAString {

    public static String reverseVowels(String s) {

        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        String vowels = "aeiouAEIOU";

        while (left < right) {

            while (left < right &&
                    vowels.indexOf(arr[left]) == -1) {
                left++;
            }

            while (left < right &&
                    vowels.indexOf(arr[right]) == -1) {
                right--;
            }

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }

    public static void main(String[] args) {

        String s = "hello";

        System.out.println(reverseVowels(s));
    }
}

/*
LeetCode 345 - Reverse Vowels of a String

Example:
Input  : "hello"
Output : "holle"

Input  : "leetcode"
Output : "leotcede"

Approach:
1. Use two pointers.
2. Move left pointer until vowel found.
3. Move right pointer until vowel found.
4. Swap vowels.
5. Continue until pointers cross.

Time Complexity  : O(n)
Space Complexity : O(n)
*/