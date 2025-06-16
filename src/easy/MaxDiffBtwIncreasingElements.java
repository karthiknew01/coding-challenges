package easy;

/**
 * <a href="https://leetcode.com/problems/maximum-difference-between-increasing-elements/description/?envType=daily-question&envId=2025-06-16">...</a>
 */
public class MaxDiffBtwIncreasingElements {

    public static void main(String[] args) {
        int[] nums = {7,1,5,4};
        System.out.println(maximumDifference(nums));
    }

    public static int maximumDifference(int[] nums) {
        int left = nums[0];
        int diff = -1;
        for (int n: nums) {
            if (left < n) {
                diff = Math.max(diff, n - left);
            }

            left = Math.min(left, n);
        }

        return diff;
    }

}
