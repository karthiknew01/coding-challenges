package easy;

import util.TreeNode;

/**
 * <a href="https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/">...</a>
 */
public class CreateSortedBinaryTree {

    public static void main(String[] args) {
        int[] nums = {-10,-3,0,5,9};
        sortedArrayToBST(nums).printInOrder();
    }


    public static TreeNode sortedArrayToBST(int[] nums) {
        return createNode(nums, 0, nums.length - 1);
    }

    public static TreeNode createNode(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = createNode(nums, start, mid - 1);
        node.right = createNode(nums, mid + 1, end);

        return node;
    }

}
