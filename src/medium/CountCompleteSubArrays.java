package medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/count-complete-subarrays-in-an-array/?envType=daily-question&envId=2025-04-24">...</a>
 */
public class CountCompleteSubArrays {

    public static void main(String[] args) {
        int[] nums = {5,5,5,5};
        System.out.println(countCompleteSubarrays(nums));
    }

    public static int countCompleteSubarrays(int[] nums) {
        int left = 0, res = 0;
        int n = nums.length;
        Map<Integer, Integer> windowCount = new HashMap<>();
        int k = (int) Arrays.stream(nums).distinct().count();
        for (int r = 0; r < n; r++) {
             int num = nums[r];
             windowCount.put(num, windowCount.getOrDefault(num, 0) + 1);
             while (windowCount.size() == k) {
                res += n - r;
                int leftNum = nums[left];
                windowCount.put(leftNum, windowCount.get(leftNum) - 1);
                if (windowCount.get(leftNum) == 0) {
                    windowCount.remove(leftNum);
                }
                left++;
             }        }


        return res;
    }

}
