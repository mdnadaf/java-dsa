/**
 * LeetCode 543 - Diameter of Binary Tree
 *
 * Time Complexity: O(n)
 * Space Complexity: O(h)
 */

class LC_543_DiameterOfBinaryTree {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    private int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }

    private int height(TreeNode root) {

        if (root == null)
            return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        diameter = Math.max(diameter, leftHeight + rightHeight);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {

        /*
                  1
                /   \
               2     3
              / \
             4   5
        */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        LC_543_DiameterOfBinaryTree obj = new LC_543_DiameterOfBinaryTree();

        System.out.println("Diameter = " + obj.diameterOfBinaryTree(root));
    }
}