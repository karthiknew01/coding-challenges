package easy;

import util.TreeNode;

public class SymmetricTree {

    public static void main(String[] args) {
        TreeNode leftLeft = new TreeNode(3);
        TreeNode leftRight = new TreeNode(4);
        TreeNode left = new TreeNode(2, leftLeft, leftRight);

        TreeNode rightLeft = new TreeNode(3);
        TreeNode rightRight = new TreeNode(4);
        TreeNode right = new TreeNode(2, rightLeft, rightRight);


        TreeNode root = new TreeNode(1, left, right);
        System.out.println(isSymmetric(root));
    }

    public static boolean isSymmetric(TreeNode root) {

        if (root == null)
            return false;

        return isSymmetric(root.left, root.right);

    }

    public static boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;

        if (left == null || right == null)
            return false;

        if (left.val != right.val)
            return false;

        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);

    }

}
