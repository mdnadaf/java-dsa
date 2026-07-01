/*
 * LeetCode 349 - Intersection of Two Arrays
 *
 * Approach:
 * - Store all elements of the first array in a HashSet.
 * - Traverse the second array.
 * - If an element exists in the set, add it to the result
 *   and remove it from the set to avoid duplicates.
 *
 * Time Complexity : O(n + m)
 * Space Complexity: O(n)
 */

import java.util.Arrays;
import java.util.HashSet;

public class LC_349_IntersectionOfTwoArrays {

    static class Solution {

        public int[] intersection(int[] nums1, int[] nums2) {

            // Store unique elements of the first array
            HashSet<Integer> set = new HashSet<>();

            for (int num : nums1) {
                set.add(num);
            }

            // Store the intersection elements
            HashSet<Integer> result = new HashSet<>();

            for (int num : nums2) {

                if (set.contains(num)) {
                    result.add(num);
                    set.remove(num); // Prevent duplicate entries
                }
            }

            // Convert HashSet to int[]
            int[] ans = new int[result.size()];
            int index = 0;

            for (int num : result) {
                ans[index++] = num;
            }

            return ans;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        System.out.println(Arrays.toString(solution.intersection(nums1, nums2)));
    }
}