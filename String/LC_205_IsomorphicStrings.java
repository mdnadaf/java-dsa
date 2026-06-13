import java.util.HashMap;
import java.util.HashSet;

public class LC_205_IsomorphicStrings {

    public static boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> used = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {

            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if (map.containsKey(ch1)) {

                if (map.get(ch1) != ch2) {
                    return false;
                }

            } else {

                if (used.contains(ch2)) {
                    return false;
                }

                map.put(ch1, ch2);
                used.add(ch2);
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "egg";
        String t = "add";

        System.out.println(isIsomorphic(s, t));
    }
}

/*
LeetCode 205 - Isomorphic Strings

Example:
Input  : s = "egg", t = "add"
Output : true

Input  : s = "foo", t = "bar"
Output : false

Approach:
1. Map characters from s to t.
2. Ensure one-to-one mapping.
3. If mapping conflicts, return false.
4. Otherwise return true.

Time Complexity  : O(n)

Space Complexity : O(n)
*/