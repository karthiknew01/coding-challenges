package easy;

/**
 * <a href="https://leetcode.com/problems/apply-operations-to-an-array/?envType=daily-question&envId=2025-05-29">...</a>
 */
public class ApplyOperationToArray {

    public static void main(String[] args) {
        int[] nums = {1,2,2,1,1,0};
        int[] res = applyOperations(nums);

        for (int n: res)
            System.out.println(n);
    }

    public static int[] applyOperations(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i+1]) {
                nums[i] *= 2;
                nums[i+1] = 0;
            }
        }

        int j = 0;
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            if (num != 0) {
                nums[j++] = num;
            }
        }

        for (int i = j; i < n; i++) {
            nums[i] = 0;
        }

        return nums;
    }

}
