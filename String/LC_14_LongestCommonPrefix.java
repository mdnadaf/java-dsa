public class LC_14_LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {

            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        return prefix;
    }

    public static void main(String[] args) {

        String[] strs = {"flower", "flow", "flight"};

        System.out.println(longestCommonPrefix(strs));
    }
}

/*
LeetCode 14 - Longest Common Prefix

Example:
Input  : ["flower","flow","flight"]
Output : "fl"

Input  : ["dog","racecar","car"]
Output : ""

Approach:
1. Assume first string as prefix.
2. Compare prefix with every string.
3. If current string doesn't start with prefix,
   keep reducing prefix length.
4. Return final prefix.

Time Complexity  : O(n * m)
n = number of strings
m = length of prefix

Space Complexity : O(1)
*/