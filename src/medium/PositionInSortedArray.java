package medium;

/**
 * <a href="https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/">...</a>
 */
public class PositionInSortedArray {

    public static void main(String[] args) {
        int[] nums = {};
        int target = 6;

        int[] index = searchRange(nums, target);

        for (int d: index) {
            System.out.println(d);
        }
    }

    public static int[] searchRange(int[] nums, int target) {
        int first = -1, last = -1;
        int lo = 0, hi = nums.length - 1;

        int mid = -1;
        while(lo <= hi) {
            mid = lo + (hi - lo) / 2;

            int num = nums[mid];
            if (num == target) {
                break;
            }

            if (num < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        int loMid = mid, hiMid = mid;
        while (loMid >= 0) {
            if (target != nums[loMid]) {
                break;
            }
            first = loMid--;
        }

        while (hiMid >= 0 && hiMid <= nums.length - 1) {
            if (target != nums[hiMid]) {
                break;
            }
            last = hiMid++;
        }



        return new int[]{first, last};
    }
}
