/**
 * LeetCode 100 - Same Tree
 *
 * Time Complexity: O(n)
 * Space Complexity: O(h)
 */

class LC_100_SameTree {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null)
            return true;

        if (p == null || q == null || p.val != q.val)
            return false;

        return isSameTree(p.left, q.left)
                && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {

        /*
                Tree 1

                  1
                /   \
               2     3
        */

        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        /*
                Tree 2

                  1
                /   \
               2     3
        */

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        LC_100_SameTree obj = new LC_100_SameTree();

        System.out.println(obj.isSameTree(p, q));
    }
}