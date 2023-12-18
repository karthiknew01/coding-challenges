package medium;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/">...</a>
 */
public class TwoSum2 {

    public static void main(String[] args) {
        int[] numbers = new int[] {2,7,11,15};
        int target = 9;

        int[] result = twoSum(numbers, target);
        for (int i: result) {
            System.out.println(i);
        }
    }

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (target == sum) {
                return new int[]{left + 1, right + 1};
            } else if (target > sum) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{0,0};
    }
}
