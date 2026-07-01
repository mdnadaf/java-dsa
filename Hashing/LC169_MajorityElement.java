/*
 * LeetCode 169 - Majority Element
 *
 * Approach:
 * - Use a HashMap to store the frequency of each element.
 * - Traverse the array and update the frequency.
 * - As soon as any element appears more than n/2 times,
 *   return it.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */

import java.util.HashMap;

public class LC169_MajorityElement {

    public static int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {

            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) > nums.length / 2) {
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        // Sample Test Case
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
        int ans = majorityElement(nums);

        System.out.println("Input Array      : [2, 2, 1, 1, 1, 2, 2]");
        System.out.println("Majority Element : " + ans);
    }
}
