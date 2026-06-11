// LeetCode 28 - Find the Index of the First Occurrence in a String
// Pattern: String Matching (Brute Force)
// Time Complexity: O((n - m + 1) * m)
// Space Complexity: O(1)

public class LC_28_Find_the_Index_of_the_First_Occurrence_in_a_String {

    public static int strStr(String haystack, String needle) {

        int n = haystack.length();
        int m = needle.length();

        // Check every possible starting index
        for (int i = 0; i <= n - m; i++) {

            int j = 0;

            // Compare characters one by one
            while (j < m &&
                    haystack.charAt(i + j) == needle.charAt(j)) {

                j++;
            }

            // If all characters matched
            if (j == m) {
                return i;
            }
        }

        // Needle not found
        return -1;
    }

    public static void main(String[] args) {

        String haystack = "sadbutsad";
        String needle = "sad";

        int result = strStr(haystack, needle);

        System.out.println("First Occurrence Index = " + result);
    }
}