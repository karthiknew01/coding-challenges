package easy;

/**
 * <a href="https://leetcode.com/problems/count-equal-and-divisible-pairs-in-an-array/description/?envType=daily-question&envId=2025-04-17">...</a>
 */
public class CountEqualDivisiblePairs {

    public static void main(String[] args) {
        int[] nums = {3,1,2,2,2,1,3};
        int k = 2;
        System.out.println(countPairs(nums, k));
    }

    public static int countPairs(int[] nums, int k) {
        int pairs = 0;
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i+1; j < n; j++) {
                if ((i * j) % k == 0 && nums[i] == nums[j])
                    pairs++;
            }
        }
        return pairs;
    }

}
