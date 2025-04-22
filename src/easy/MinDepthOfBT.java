package easy;

import util.TreeNode;

/**
 * <a href="https://leetcode.com/problems/minimum-depth-of-binary-tree/description/">...</a>
 */
public class MinDepthOfBT {

    public static void main(String[] args) {
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3, left, null);
        TreeNode p = new TreeNode(1, left, right);

        System.out.println(minDepth(p));
    }

    public static int minDepth(TreeNode root) {
        if (root == null)
            return 0;

        if (root.left == null && root.right == null)
            return 1;

        if (root.left == null)
            return 1 + minDepth(root.right);

        if (root.right == null)
            return 1 + minDepth(root.left);

        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }

}
