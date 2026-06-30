/**
 * LeetCode 98 - Validate Binary Search Tree
 *
 * Time Complexity: O(n)
 * Space Complexity: O(h)
 */

class LC_98_ValidateBinarySearchTree {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean validate(TreeNode root, long min, long max) {

        if (root == null)
            return true;

        if (root.val <= min || root.val >= max)
            return false;

        return validate(root.left, min, root.val)
                && validate(root.right, root.val, max);
    }

    public static void main(String[] args) {

        /*
         * 8
         * / \
         * 5 10
         * / \ \
         * 3 6 11
         */

        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(5);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(6);
        root.right.right = new TreeNode(11);

        LC_98_ValidateBinarySearchTree obj = new LC_98_ValidateBinarySearchTree();

        System.out.println("Is Valid BST: " + obj.isValidBST(root));
    }
}
/*
 * OUTPUT
 * Is Valid BST: true
 */