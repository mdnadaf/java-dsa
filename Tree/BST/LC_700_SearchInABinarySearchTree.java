/**
 * LeetCode 700 - Search in a Binary Search Tree
 *
 * Approach:
 * - Compare the target value with the current node.
 * - If equal, return the node.
 * - If smaller, search in the left subtree.
 * - If greater, search in the right subtree.
 *
 * Time Complexity:
 * Average: O(log n)
 * Worst: O(n)
 *
 * Space Complexity:
 * Average: O(log n)
 * Worst: O(n)
 */

class LC_700_SearchInABinarySearchTree {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode searchBST(TreeNode root, int val) {

        if (root == null || root.val == val)
            return root;

        if (val < root.val)
            return searchBST(root.left, val);

        return searchBST(root.right, val);
    }

    public void inorder(TreeNode root) {

        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
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

        LC_700_SearchInABinarySearchTree obj = new LC_700_SearchInABinarySearchTree();

        int target = 6;

        TreeNode result = obj.searchBST(root, target);

        if (result != null) {
            System.out.println("Node Found: " + result.val);

            System.out.print("Subtree Inorder: ");
            obj.inorder(result);
        } else {
            System.out.println("Node Not Found");
        }
    }
}

/*
 * OUTPUT
 * Node Found: 6
 * Subtree Inorder: 6
 */