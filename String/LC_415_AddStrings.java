public class LC_415_AddStrings {

    public static String addStrings(String num1, String num2) {

        StringBuilder result = new StringBuilder();

        int i = num1.length() - 1;
        int j = num2.length() - 1;

        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {

            int sum = carry;

            if (i >= 0) {
                sum += num1.charAt(i--) - '0';
            }

            if (j >= 0) {
                sum += num2.charAt(j--) - '0';
            }

            result.append(sum % 10);

            carry = sum / 10;
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {

        System.out.println(addStrings("11", "123"));
    }
}

/*
LeetCode 415 - Add Strings

Example:
Input  : num1 = "11", num2 = "123"
Output : "134"

Input  : num1 = "456", num2 = "77"
Output : "533"

Approach:
1. Start from last digit of both strings.
2. Add digits along with carry.
3. Store result digit in StringBuilder.
4. Continue until all digits and carry are processed.
5. Reverse StringBuilder and return.

Time Complexity  : O(max(n,m))
Space Complexity : O(max(n,m))
*/
