/**
 * LeetCode 701 - Insert into a Binary Search Tree
 *
 * Time Complexity:
 * Average: O(log n)
 * Worst: O(n)
 *
 * Space Complexity:
 * Average: O(log n)
 * Worst: O(n)
 */

class LC_701_InsertIntoABinarySearchTree {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode insertIntoBST(TreeNode root, int val) {

        if (root == null)
            return new TreeNode(val);

        if (val < root.val)
            root.left = insertIntoBST(root.left, val);
        else
            root.right = insertIntoBST(root.right, val);

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

        LC_701_InsertIntoABinarySearchTree obj = new LC_701_InsertIntoABinarySearchTree();

        root = obj.insertIntoBST(root, 7);

        System.out.print("Inorder Traversal: ");
        obj.inorder(root);
    }
}

/*
 * OUTPUT
 * Inorder Traversal: 3 5 6 7 8 10 11
 * 
 */