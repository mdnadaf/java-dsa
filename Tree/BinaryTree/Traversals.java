import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class Traversals {

    // preorder traversal
    static void preorder(Node root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // inorder traversal
    static void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // postorder traversal
    static void postorder(Node root) {
        if (root == null)
            return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    // level order traversal
    static void levelOrder(Node root) {
        if (root == null)
            return;

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            Node curr = q.poll();
            System.out.print(curr.data + " ");

            if (curr.left != null)
                q.offer(curr.left);

            if (curr.right != null)
                q.offer(curr.right);
        }
    }

    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.print("Preorder : ");
        preorder(root);

        System.out.println();
        System.out.print("Inorder  : ");
        inorder(root);

        System.out.println();
        System.out.print("Postorder: ");
        postorder(root);

        System.out.println();
        System.out.print("Levelorder: ");
        levelOrder(root);
    }
}

/*
 * 
 * 1
 * / \
 * 2 3
 * / \ / \
 * 4 5 6 7
 * 
 * Preorder : 1 2 4 5 3 6 7
 * Inorder : 4 2 5 1 6 3 7
 * Postorder: 4 5 2 6 7 3 1
 * Levelorder: 1 2 3 4 5 6 7
 */