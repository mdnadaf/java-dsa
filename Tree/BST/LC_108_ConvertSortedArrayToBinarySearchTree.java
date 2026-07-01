/**
 * LeetCode 108 - Convert Sorted Array to Binary Search Tree
 *
 * Time Complexity: O(n)
 * Space Complexity: O(log n)
 */

class LC_108_ConvertSortedArrayToBinarySearchTree {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return buildBST(nums, 0, nums.length - 1);
    }

    private TreeNode buildBST(int[] nums, int start, int end) {

        if (start > end)
            return null;

        int mid = start + (end - start) / 2;

        TreeNode root = new TreeNode(nums[mid]);

        root.left = buildBST(nums, start, mid - 1);
        root.right = buildBST(nums, mid + 1, end);

        return root;
    }

    public void inorder(TreeNode root) {

        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        int[] nums = { -10, -3, 0, 5, 9 };

        LC_108_ConvertSortedArrayToBinarySearchTree obj = new LC_108_ConvertSortedArrayToBinarySearchTree();

        TreeNode root = obj.sortedArrayToBST(nums);

        System.out.print("Inorder Traversal: ");
        obj.inorder(root);
    }
}

/*
 * OUTPUT
 * Inorder Traversal: -10 -3 0 5 9
 */