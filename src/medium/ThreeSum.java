package medium;

import java.util.*;

/**
 * https://leetcode.com/problems/3sum/description/
 */
public class ThreeSum {

    public static void main(String[] args) {
        int[] nums = new int[] {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        nums = Arrays.stream(nums).sorted().toArray();
        for (int i=0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i - 1] == nums[i])
                continue;

            int left = i + 1, right = nums.length - 1;

            while(left < right) {
                if (left > i+1 && nums[left - 1] == nums[left]) {
                    left++;
                    continue;
                }

                if (right < nums.length - 1 && nums[right + 1] == nums[right]) {
                    right--;
                    continue;
                }

                int threeSum = nums[left] + nums[right] + nums[i];
                System.out.println(nums[i] + " " + nums[left] + " " + nums[right]);
                if (threeSum == 0) {
                    List<Integer> subList = new ArrayList<>();
                    subList.add(nums[i]);
                    subList.add(nums[left]);
                    subList.add(nums[right]);
                    list.add(subList);
                }

                if (threeSum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return list;
    }
}
