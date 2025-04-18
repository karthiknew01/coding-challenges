package easy;

import util.TreeNode;

/**
 * <a href="https://leetcode.com/problems/maximum-depth-of-binary-tree/description/">...</a>
 */
public class DepthOfBT {

    public static void main(String[] args) {
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3, left, null);
        TreeNode p = new TreeNode(1, left, right);

        System.out.println(maxDepth(p));
    }

    public static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        return Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
    }
}
