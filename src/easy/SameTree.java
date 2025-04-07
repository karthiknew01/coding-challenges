package easy;

import util.TreeNode;

/**
 * <a href="https://leetcode.com/problems/same-tree/">...</a>
 */
public class SameTree {

    public static void main(String[] args) {
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode p = new TreeNode(1, left, right);
        TreeNode q = new TreeNode(1, left, left);

        System.out.println(isSameTree(p, q));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;

        if (p == null || q == null)
            return false;

        if (p.val != q.val)
            return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

}
