package medium;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/count-the-number-of-good-subarrays/description/?envType=daily-question&envId=2025-04-17">...</a>
 */
public class CountNoOfGoodArray {

    public static void main(String[] args) {
        int[] nums = {3,1,4,3,2,2,4}; int k = 2;
        System.out.println(countGood(nums, k));
    }

    public static long countGood(int[] nums, int k) {
        long res = 0;
        int left = 0, n = nums.length;
        long pairCount = 0;

        Map<Integer, Integer> freq = new HashMap<>();
        for(int right = 0; right < n; right++) {
            int count = freq.getOrDefault(nums[right], 0);
            pairCount += count;
            freq.put(nums[right], count + 1);

            while (pairCount >= k) {
                res += n - right;
                int leftNum = nums[left++];
                freq.put(leftNum, freq.get(leftNum) - 1);
                pairCount -= freq.get(leftNum);
            }

        }

        return res;
    }

}
