package easy;

/**
 *  https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 */
public class RemoveDuplicateSortedArray {

    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        int exepectedLength = removeDuplicates(nums);

        System.out.println(exepectedLength);
    }

    public static int removeDuplicates(int[] nums) {
        int len = 1;

        int prev = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];

            if (prev != curr) {
                len++;
                prev = curr;
                nums[len-1] = curr;
            }
        }

        for (int j = 0; j < len; j++) {
            System.out.println(nums[j]);
        }

        return len;
    }


}
