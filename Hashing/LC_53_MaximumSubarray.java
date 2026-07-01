/*
 * LeetCode 53 - Maximum Subarray
 *
 * Approach:
 * Kadane's Algorithm
 *
 * - Traverse the array while maintaining the current subarray sum.
 * - Update the maximum sum whenever a larger sum is found.
 * - If the current sum becomes negative, reset it to 0,
 *   since a negative sum cannot contribute to a larger subarray.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

public class LC_53_MaximumSubarray {

    static class Solution {

        public int maxSubArray(int[] nums) {

            int maxSum = nums[0];

            int currentSum = 0;

            for (int num : nums) {

                currentSum += num;

                maxSum = Math.max(maxSum, currentSum);

                if (currentSum < 0) {
                    currentSum = 0;
                }
            }

            return maxSum;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println("Maximum Subarray Sum = " + solution.maxSubArray(nums));
    }
}