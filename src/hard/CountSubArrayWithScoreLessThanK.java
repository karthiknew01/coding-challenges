package hard;

import java.util.Arrays;

public class CountSubArrayWithScoreLessThanK {

    public static void main(String[] args) {
        int[] nums = {1,1,1};
        System.out.println(countSubarrays(nums, 5));
    }

    public static long countSubarrays(int[] nums, long k) {
        long res = 0;
        int n = nums.length;
        Arrays.sort(nums);

        int left = 0;
        long currentSum = 0;
        for (int right = 0; right < n; right++) {
            currentSum += nums[right];
            while (currentSum * (right - left + 1) >= k ) {
                currentSum -= nums[left++];
            }
            res += right - left + 1;
        }

        return res;
    }
}
