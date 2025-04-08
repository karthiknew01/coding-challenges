package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/minimum-number-of-operations-to-make-elements-in-array-distinct/description/?envType=daily-question&envId=2025-04-08">...</a>
 */
public class MinOperToDistintArray {

    public static void main(String[] args) {
        int[] num = { 4,5,6,4,4 };

        System.out.println(minimumOperations(num));
    }

    public static int minimumOperations(int[] nums) {
        int n = nums.length;
        Set<Integer> seen = new HashSet<>();
        for (int i = n - 1; i >= 0; i--) {
            if (seen.contains(nums[i])) {
                return i / 3 + 1;
            }
            seen.add(nums[i]);
        }

        return 0;
    }

}
