package easy;

/**
 * <a href="https://leetcode.com/problems/remove-element/description/">...</a>
 */
public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = new int[] { 0,1,2,2,3,0,4,2 };
        int val = 2;

        int result = removeElement(nums, val);
        System.out.println(result);
    }

    public static int removeElement(int[] nums, int val) {
        int len = 0;

        int numLen = nums.length;
        int i = 0;
        while (i < numLen) {
            if (nums[i] != val) {
                nums[len] = nums[i];
                len++;
            }
            i++;
        }

        return len;
    }

}
