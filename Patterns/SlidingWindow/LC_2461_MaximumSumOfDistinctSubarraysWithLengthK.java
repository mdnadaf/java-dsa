import java.util.*;

public class LC_2461_MaximumSumOfDistinctSubarraysWithLengthK {

    public static long maximumSubarraySum(int[] nums, int k) {

        // Stores frequency of elements in current window
        HashMap<Integer, Integer> map = new HashMap<>();

        long currentSum = 0;
        long maxSum = 0;

        for (int i = 0; i < nums.length; i++) {

            // Add current element to window sum
            currentSum += nums[i];

            // Increase frequency of current element
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            // Window size becomes k
            if (i >= k - 1) {

                // If all elements are distinct
                if (map.size() == k) {
                    maxSum = Math.max(maxSum, currentSum);
                }

                // Remove leftmost element from window sum
                currentSum -= nums[i - k + 1];

                // Decrease frequency of outgoing element
                map.put(nums[i - k + 1],
                        map.get(nums[i - k + 1]) - 1);

                // Remove element if frequency becomes 0
                if (map.get(nums[i - k + 1]) == 0) {
                    map.remove(nums[i - k + 1]);
                }
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] nums = {1, 5, 4, 2, 9, 9, 9};
        int k = 3;

        System.out.println(maximumSubarraySum(nums, k));
    }
}