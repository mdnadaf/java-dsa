/**
 * LeetCode 230 - Kth Smallest Element in a BST
 * APROACH
 * 
 * Traverse the left subtree.
 * Increment the counter after visiting the current node.
 * If count == k, store the current node's value as the answer.
 * Traverse the right subtree.
 * Return the stored answer.
 * 
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(h)
 */

class LC_230_KthSmallestElementInABST {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    int count = 0;
    int ans = 0;

    public int kthSmallest(TreeNode root, int k) {

        inorder(root, k);
        return ans;
    }

    private void inorder(TreeNode root, int k) {

        if (root == null)
            return;

        inorder(root.left, k);

        count++;

        if (count == k) {
            ans = root.val;
            return;
        }

        inorder(root.right, k);
    }

    public static void main(String[] args) {

        /*
         * 5
         * / \
         * 3 6
         * / \
         * 2 4
         * /
         * 1
         */

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        root.left.left.left = new TreeNode(1);

        LC_230_KthSmallestElementInABST obj = new LC_230_KthSmallestElementInABST();

        int k = 3;

        System.out.println("Kth Smallest Element: " +
                obj.kthSmallest(root, k));
    }
}

/*
 * OUTPUT
 * Kth Smallest Element: 3
 */