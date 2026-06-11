public class LC_151_Reverse_Words_in_a_String {

    public static String reverseWords(String s) {

        // Remove leading/trailing spaces
        // and split words by one or more spaces
        String[] words = s.trim().split(" +");

        StringBuilder result = new StringBuilder();

        // Traverse from last word to first word
        for (int i = words.length - 1; i >= 0; i--) {

            result.append(words[i]);
            result.append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {

        String s = "  the sky   is blue  ";

        System.out.println("Original String : " + s);

        String ans = reverseWords(s);

        System.out.println("Reversed String : " + ans);
    }
}