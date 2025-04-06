package medium;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/largest-divisible-subset/description/?envType=daily-question&envId=2025-04-06">...</a>
 */
public class LargestDivisibleSubset {

    public static void main(String[] args) {
        int[] nums = {1,2,4,8};

        List<Integer> l = largestDivisibleSubset(nums);

        for (int i : l) {
            System.out.println(i);
        }
    }


    public static List<Integer> largestDivisibleSubset(int[] nums) {

        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);
        List<List<Integer>> subsets = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            subsets.add(new ArrayList<>());
        }
        for (int i = 0; i < nums.length; i++) {
            List<Integer> subset = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && subsets.get(j).size() > subset.size()) {
                    subset = subsets.get(j);
                }
            }
            subsets.get(i).addAll(subset);
            subsets.get(i).add(nums[i]);

            if (subsets.get(i).size() > result.size())
                result = subsets.get(i);
        }

        return result;
    }
}
