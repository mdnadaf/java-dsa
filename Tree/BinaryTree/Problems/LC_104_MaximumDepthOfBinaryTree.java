/**
 * LeetCode 104 - Maximum Depth of Binary Tree
 *
 * Time Complexity: O(n)
 * Space Complexity: O(h)
 */

class LC_104_MaximumDepthOfBinaryTree {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public int maxDepth(TreeNode root) {

        if (root == null)
            return 0;

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public static void main(String[] args) {

        /*
         * 1
         * / \
         * 2 3
         * / \
         * 4 5
         */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        LC_104_MaximumDepthOfBinaryTree obj = new LC_104_MaximumDepthOfBinaryTree();

        System.out.println("Maximum Depth = " + obj.maxDepth(root));
    }
}