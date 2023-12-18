package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/description/
 */
public class TwoSum {

    public static void main(String[] args) {
       int[] nums = new int[]{3,3};
       int[] sum = twoSum(nums, 6);
       for (int i: sum) {
           System.out.println(i);
       }
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) != null) {
                return new int[]{map.get(nums[i]), i};
            } else {
                map.put(target - nums[i], i);
            }
        }
        return new int[]{0,0};
    }
}
