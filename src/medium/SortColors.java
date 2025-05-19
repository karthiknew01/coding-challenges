package medium;

/**
 * <a href="https://leetcode.com/problems/sort-colors/description/?envType=daily-question&envId=2025-05-18">...</a>
 */
public class SortColors {

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
    }

    public static void sortColors(int[] nums) {

        int rCount = 0, gCount = 0;
        for (int n: nums) {
            if (n == 0)
                rCount++;
            else if (n == 1)
                gCount++;
        }

        for (int i = 0; i < nums.length; i++) {
            if (rCount > 0) {
                nums[i] = 0;
                rCount--;
            } else if (gCount > 0) {
                nums[i] = 1;
                gCount--;
            } else {
                nums[i] = 2;
            }
        }

        for (int n: nums)
            System.out.println(n);

    }
}
