package easy;

/**
 * <a href="https://leetcode.com/problems/count-subarrays-of-length-three-with-a-condition/description/?envType=daily-question&envId=2025-04-27">...</a>
 */
public class CountSubarrayWithACondition {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        System.out.println(countSubarrays(nums));
    }

    public static int countSubarrays(int[] nums) {
        int res = 0;
        int n = nums.length;
        for (int i = 0; i + 2 < n; i++) {
                if (2 * (nums[i] + nums[i+2]) == nums[i+1]) {
                    res++;
                }
        }

        return res;
    }

}
