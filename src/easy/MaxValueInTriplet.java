package easy;

/**
 * <a href="https://leetcode.com/problems/maximum-value-of-an-ordered-triplet-i/?envType=daily-question&envId=2025-04-02">...</a>
 */
public class MaxValueInTriplet {

    public static void main(String[] args) {
        int[] num = {12,6,1,2,7};
        System.out.println(maximumTripletValue(num));
    }

    public static long maximumTripletValue(int[] nums) {
//        long res = 0;
//
//        for (int i = 0; i < nums.length - 2; i++) {
//            for (int j = i + 1; j < nums.length - 1; j++) {
//                for (int k = j + 1; k < nums.length; k++) {
//                    res = Math.max(res, (long) (nums[i] - nums[j]) * nums[k]);
//                }
//            }
//        }
//
//        return res;

        long maxTriplet = 0, maxElement = 0, maxDiff = 0;

        for (int num : nums) {
            maxTriplet = Math.max(maxTriplet, maxDiff * num);
            maxDiff = Math.max(maxDiff, maxElement - num);
            maxElement = Math.max(maxElement, num);
        }

        return maxTriplet;

    }

}
