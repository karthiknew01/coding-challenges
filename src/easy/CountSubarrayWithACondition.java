package easy;

/**
 * <a href="https://leetcode.com/problems/count-subarrays-of-length-three-with-a-condition/description/?envType=daily-question&envId=2025-04-27">...</a>
 */
public class CountSubarrayWithACondition {
    public static void main(String[] args) {
        int[] nums = {1,2,1,4,1};
        System.out.println(countSubarrays(nums));
    }

    public static int countSubarrays(int[] nums) {
        int res = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 2; j < n; j++) {
                int middle = (i + j) / 2;
                if ((nums[i] + nums[j]) == 2 * nums[middle]) {
                    res++;
                }
            }
        }

        return res;
    }

}
