package easy;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/maximum-product-difference-between-two-pairs/description">...</a>
 */
public class MaxProductDifference {

    public static void main(String[] args) {
        int[] nums = new int[] {5,6,2,7,4};
        System.out.println(maxProductDifference(nums));
    }

    public static int maxProductDifference(int[] nums) {
        int w = 0, x = 0, y=Integer.MAX_VALUE, z=Integer.MAX_VALUE;
        int length = nums.length;
        nums = Arrays.stream(nums).sorted().toArray();

//        for (int i = 0; i < nums.length; i++) {
//            int num = nums[i];
//
//            if (w < num) {
//                x = w;
//                w = num;
//            } else if (x < num) {
//                x = num;
//            }
//
//            if (y > num) {
//                z = y;
//                y = num;
//            } else if (z > num) {
//                z = num;
//            }
//
//        }

        return (nums[length -1] * nums[length -2]) - (nums[0] * nums[1]);
    }
}
