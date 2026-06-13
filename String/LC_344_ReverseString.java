public class LC_344_ReverseString {

    public static void reverseString(char[] s) {

        int left = 0;
        int right = s.length - 1;

        while (left < right) {

            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        char[] arr = {'h', 'e', 'l', 'l', 'o'};

        reverseString(arr);

        System.out.println(arr);
    }
}

/*
LeetCode 344 - Reverse String

Example:
Input  : ['h','e','l','l','o']
Output : ['o','l','l','e','h']

Approach:
1. Use two pointers.
2. Swap first and last character.
3. Move pointers toward center.
4. Continue until left >= right.

Time Complexity  : O(n)
Space Complexity : O(1)
*/