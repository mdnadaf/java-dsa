/**
 * LeetCode 450 - Delete Node in a BST
 *
 * Time Complexity:
 * Average: O(log n)
 * Worst: O(n)
 *
 * Space Complexity:
 * Average: O(log n)
 * Worst: O(n)
 */

class LC_450_DeleteNodeInABST {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode deleteNode(TreeNode root, int key) {

        if (root == null)
            return null;

        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {

            if (root.left == null)
                return root.right;

            if (root.right == null)
                return root.left;

            TreeNode successor = findMin(root.right);

            root.val = successor.val;

            root.right = deleteNode(root.right, successor.val);
        }

        return root;
    }

    private TreeNode findMin(TreeNode root) {

        while (root.left != null)
            root = root.left;

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

        LC_450_DeleteNodeInABST obj = new LC_450_DeleteNodeInABST();

        root = obj.deleteNode(root, 5);

        System.out.print("Inorder Traversal: ");
        obj.inorder(root);
    }
}

/*
 * OUTPUT
 * Inorder Traversal: 3 6 8 10 11
 */