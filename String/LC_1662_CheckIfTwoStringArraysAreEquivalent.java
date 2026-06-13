public class LC_1662_CheckIfTwoStringArraysAreEquivalent {

    public static boolean arrayStringsAreEqual(
            String[] word1,
            String[] word2) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (String str : word1) {
            sb1.append(str);
        }

        for (String str : word2) {
            sb2.append(str);
        }

        return sb1.toString().equals(sb2.toString());
    }

    public static void main(String[] args) {

        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};

        System.out.println(
                arrayStringsAreEqual(word1, word2));
    }
}

/*
LeetCode 1662 - Check If Two String Arrays Are Equivalent

Example:
Input  : word1 = ["ab","c"]
         word2 = ["a","bc"]
Output : true

Approach:
1. Join all strings of word1.
2. Join all strings of word2.
3. Compare resulting strings.
4. Return comparison result.

Time Complexity  : O(n + m)
Space Complexity : O(n + m)
*/