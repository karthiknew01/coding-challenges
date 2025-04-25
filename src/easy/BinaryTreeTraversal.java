package easy;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeTraversal {

    public static void main(String[] args) {
        System.out.println(inorderTraversal(null));
    }

    static List<Integer> result = new ArrayList<>();

    public static List<Integer> inorderTraversal(TreeNode root) {
        if (root == null)
            return result;

        result.addAll(inorderTraversal(root.left));
        result.add(root.val);
        result.addAll(inorderTraversal(root.right));

        return result;
    }



}
