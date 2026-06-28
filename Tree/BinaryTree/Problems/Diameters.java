class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

class Info {
    int diam;
    int ht;

    Info(int diam, int ht) {
        this.diam = diam;
        this.ht = ht;
    }
}

public class Diameters {

    static Info diameter(Node root) {

        if (root == null)
            return new Info(0, 0);

        Info left = diameter(root.left);
        Info right = diameter(root.right);

        int height = Math.max(left.ht, right.ht) + 1;

        int selfDiameter = left.ht + right.ht + 1;

        int diameter = Math.max(selfDiameter,
                Math.max(left.diam, right.diam));

        return new Info(diameter, height);
    }

    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        Info ans = diameter(root);

        System.out.println(ans.diam);
    }
}

/*
 * 
 * 1
 * / \
 * 2 3
 * / \
 * 4 5
 * 
 * output : 4
 * 
 */