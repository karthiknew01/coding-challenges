package easy;

/**
 * https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/?envType=daily-question&envId=2023-12-12
 */
public class MaxProduct {

    public static void main(String[] args) {
        int[] nums = new int[]{3,7};
        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {
        int first = 0, second = 0;

        for (int num : nums) {
            if (first < num) {
                second = first;
                first = num;
            } else if (second < num) {
                second = num;
            }
        }

        return (first -1) * (second - 1);
    }
}
