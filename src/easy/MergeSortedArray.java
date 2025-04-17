package easy;

/**
 * <a href="https://leetcode.com/problems/merge-sorted-array/description/">...</a>
 */
public class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0}, nums2 = {2,5,6};
        int m = 3,  n = 3;

        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while (i >= 0 && j >= 0)
            nums1[k--] = (nums1[i] > nums2[j]) ? nums1[i--] : nums2[j--];
        while (j >= 0)
            nums1[k--] = nums2[j--];

        for (int num: nums1) {
            System.out.println(num);
        }
    }
}
