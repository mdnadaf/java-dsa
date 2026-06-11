public class LC_58_LengthOfLastWord {

    public static int lengthOfLastWord(String s) {

        int length = 0;

        // Start from last index
        int i = s.length() - 1;

        // Ignore trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Count last word characters
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }

    public static void main(String[] args) {

        String s = "Hello World";

        System.out.println(
                "Length of Last Word = "
                        + lengthOfLastWord(s));
    }
}

// Time Complexity  : O(n)
// Space Complexity : O(1)