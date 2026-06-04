public class LC_287_FindDuplicateNumber {

    public static int findDuplicate(int[] nums) {

        int slow = nums[0];
        int fast = nums[0];

        // Detect cycle
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Find cycle entrance
        slow = nums[0];

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, 4, 2, 3};

        System.out.println("Duplicate Number: " + findDuplicate(nums));
    }
}

// time complexity : O(n)
// space complexity : O(1)