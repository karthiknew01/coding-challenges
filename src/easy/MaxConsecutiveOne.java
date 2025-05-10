package easy;

/**
 * <a href="https://leetcode.com/problems/max-consecutive-ones/description/">...</a>
 */
public class MaxConsecutiveOne {

    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
//        int left = 0, n = nums.length;
//        int max = 0;
//        for (int right = 0; right < n; right++) {
//            int num = nums[right];
//
//            if (num == 1) {
//                max = Math.max(max, right - left + 1);
//                System.out.println(right + " " + left);
//            } else {
//                left = right + 1;
//            }
//        }
//
//        return max;

        int max = 0;
        int count = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }

        return max;
    }

}
