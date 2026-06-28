/**
 * LeetCode 111 - Minimum Depth of Binary Tree
 *
 * Time Complexity: O(n)
 * Space Complexity: O(h)
 */

class LC_111_MinimumDepthOfBinaryTree {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public int minDepth(TreeNode root) {

        if (root == null)
            return 0;

        if (root.left == null)
            return minDepth(root.right) + 1;

        if (root.right == null)
            return minDepth(root.left) + 1;

        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }

    public static void main(String[] args) {

        /*
         * 1
         * / \
         * 2 3
         * /
         * 4
         */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        LC_111_MinimumDepthOfBinaryTree obj = new LC_111_MinimumDepthOfBinaryTree();

        System.out.println("Minimum Depth = " + obj.minDepth(root));
    }
}