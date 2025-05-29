package easy;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/divide-array-into-equal-pairs/?envType=daily-question&envId=2025-05-29">...</a>
 */
public class DivideArrayIntoEqualPairs {


    public static void main(String[] args) {
        int[] nums = {3,2,3,2,2,2};

        System.out.println(divideArray(nums));
    }

    public static boolean divideArray(int[] nums) {
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i = i + 2) {
            if (nums[i] != nums[i-1])
                return false;
        }

        return true;

//        Map<Integer, Boolean> map = new HashMap<>();
//        for (int num : nums) {
//            boolean v = map.getOrDefault(num, false);
//            if (v) {
//                map.remove(num);
//            } else {
//                map.put(num, true);
//            }
//        }
//
//        return map.isEmpty();
    }

}
