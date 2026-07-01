/*
 * Count Distinct Elements in an Array
 *
 * Approach:
 * - Use a HashSet to store unique elements.
 * - HashSet automatically ignores duplicate values.
 * - The final size of the HashSet represents
 *   the number of distinct elements.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */

import java.util.HashSet;

public class CountDistinctElements {

    public static int countDistinct(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        // Store all unique elements
        for (int num : nums) {
            set.add(num);
        }

        // Return the number of distinct elements
        return set.size();
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 3, 4, 4, 5, 1};

        System.out.println("Distinct Elements = " + countDistinct(nums));
    }
}