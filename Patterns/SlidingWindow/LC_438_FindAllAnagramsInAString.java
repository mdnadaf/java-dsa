import java.util.*;

public class LC_438_FindAllAnagramsInAString {

    public static List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length()) {
            return result;
        }

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        // Frequency of p
        for (char ch : p.toCharArray()) {
            pCount[ch - 'a']++;
        }

        // Sliding Window
        for (int i = 0; i < s.length(); i++) {

            // Add current character
            sCount[s.charAt(i) - 'a']++;

            // Remove character out of window
            if (i >= p.length()) {
                sCount[s.charAt(i - p.length()) - 'a']--;
            }

            // Compare frequencies
            if (Arrays.equals(pCount, sCount)) {
                result.add(i - p.length() + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String s = "cbaebabacd";
        String p = "abc";

        List<Integer> ans = findAnagrams(s, p);

        System.out.println(ans);
    }
}