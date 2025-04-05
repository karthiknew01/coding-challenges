package easy;

/**
 * <a href="https://leetcode.com/problems/sum-of-all-subset-xor-totals/description/?envType=daily-question&envId=2025-04-05">...</a>
 */
public class SumOfAllSubSetXOR {

    public static void main(String[] args) {
        int[] nums = {3,4,5,6,7,8};
        System.out.println(subsetXORSum(nums));
    }


    public static int subsetXORSum(int[] nums) {
        int xor = 0;
        for (int num: nums) {
            xor |= num;
        }

        return xor * (1 << (nums.length - 1));
    }

}
