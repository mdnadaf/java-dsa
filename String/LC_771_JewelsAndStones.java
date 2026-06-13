import java.util.HashSet;

public class LC_771_JewelsAndStones {

    public static int numJewelsInStones(
            String jewels,
            String stones) {

        HashSet<Character> set = new HashSet<>();

        for (char ch : jewels.toCharArray()) {
            set.add(ch);
        }

        int count = 0;

        for (char ch : stones.toCharArray()) {

            if (set.contains(ch)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println(
                numJewelsInStones("aA", "aAAbbbb"));
    }
}

/*
LeetCode 771 - Jewels and Stones

Example:
Input  : jewels = "aA"
         stones = "aAAbbbb"
Output : 3

Approach:
1. Store jewels in HashSet.
2. Traverse stones.
3. Count characters present in HashSet.
4. Return count.

Time Complexity  : O(n + m)
Space Complexity : O(1)
*/