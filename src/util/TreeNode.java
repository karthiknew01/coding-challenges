package util;

public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    // In-order traversal: Left -> Node -> Right
    public void printInOrder() {
        if (left != null) {
            left.printInOrder();
        }
        System.out.println(val);
        if (right != null) {
            right.printInOrder();
        }
    }
}