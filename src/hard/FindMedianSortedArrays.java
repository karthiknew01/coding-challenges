package hard;

/**
 * <a href="https://leetcode.com/problems/median-of-two-sorted-arrays/description/">...</a>
 */
public class FindMedianSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2};
        int[] nums2 = new int[]{3,4};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int mid = n / 2;
        int[] mergedArray = new int[mid+1];

        int currPost = 0, i = 0, j = 0;

        while (currPost <= mid) {
            if (i < nums1.length && (j >= nums2.length || nums1[i] < nums2[j])) {
                mergedArray[currPost] = nums1[i];
                i++;
            } else {
                mergedArray[currPost] = nums2[j];
                j++;
            }
            currPost++;
        }

        if (n % 2 == 1) {
            return mergedArray[mid];
        } else {
            return (mergedArray[mid - 1] + mergedArray[mid]) / 2.0;
        }

//        int midValues = (n % 2 == 1) ? 1 : 2;
//
//        int i = 0, j = nums2.length - 1;
//        while (Math.abs(n - (i+j)) != midValues) {
//            System.out.println(i + " " + j);
//            if (i < nums1.length) {
//                if (j > 0)
//                    i++;
//                else if (nums1[i] < nums2[j])
//                    i++;
//                else
//                    j--;
//            }
//            else {
//                j--;
//            }
//
//
//
//        }
//
//        if (midValues == 1) {
//            return (i < nums1.length) ? nums1[i] : nums2[j];
//        } else {
//            int total = 0;
//            for (; i < nums1.length; i++) {
//                total += nums1[i];
//            }
//            for (; j >= 0; j--) {
//                total += nums2[j];
//            }
//            return total / 2.0;
//        }

    }
}
