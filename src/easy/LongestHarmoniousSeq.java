package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/longest-harmonious-subsequence/?envType=daily-question&envId=2025-06-30">...</a>
 */
public class LongestHarmoniousSeq {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(findLHS(nums));
    }

    public static int findLHS(int[] nums) {
        int lhs = 0;

        Map<Integer, Integer> freq = new HashMap<>();

        for (int n: nums)
            freq.put(n, freq.getOrDefault(n, 0) + 1);

        for (int key: freq.keySet()) {
            int val1 = freq.get(key);
            int val2 = freq.getOrDefault(key + 1, 0);

            if (val2 != 0) {
                lhs = Math.max(lhs, val1 + val2);
            }

        }

        return lhs;
    }

}
