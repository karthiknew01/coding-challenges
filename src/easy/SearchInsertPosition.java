package easy;

/**
 * <a href="https://leetcode.com/problems/search-insert-position/description/">...</a>
 */
public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] nums = new int[] {1,3};
        int target = 2;
        int result = searchInsert(nums, target);
        System.out.println(result);
    }

    public static int searchInsert(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;

        while (i <= j) {
            int mid = i + (j-i)/2;
            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }

        return i;
    }

}
