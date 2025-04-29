package medium;

/**
 * <a href="https://leetcode.com/problems/count-subarrays-where-max-element-appears-at-least-k-times/description/?envType=daily-question&envId=2025-04-28">...</a>
 */
public class CountSubArrayWhereMaxElementAppearsAtLeastKTimes {

    public static void main(String[] args) {
        int[] nums = {28,5,58,91,24,91,53,9,48,85,16,70,91,91,47,91,61,4,54,61,49};
                int k = 1;
        System.out.println(countSubarrays(nums, k));
    }

    public static long countSubarrays(int[] nums, int k) {
        long res = 0;
        int left = 0;
        int n = nums.length;
        int max = 0;
        int maxCount = 0;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        for (int right = 0; right < n; right++) {
            if(nums[right] == max) maxCount++;

            while (maxCount == k) {
                res += n - right;
                if(nums[left++] == max)
                    maxCount--;
            }
        }

        return res;
    }
}
