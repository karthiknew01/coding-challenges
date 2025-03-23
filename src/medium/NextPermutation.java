package medium;


/**
 * <a href="https://leetcode.com/problems/next-permutation/">...</a>
 */
public class NextPermutation {

    public static void main(String[] args) {
        nextPermutation(new int[] {3,2,1});
    }

    public static void nextPermutation(int[] nums) {
        int n = nums.length;

        int pivot = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i+1]) {
                pivot = i;
                break;
            }
        }

        if (pivot == -1) {
            reverse(nums, 0 , n-1);

            for (int num: nums) {
                System.out.println(num);
            }
            return;
        }

        for (int i = n-1; i > pivot; i--) {
            if (nums[i] > nums[pivot]) {
                swap(nums, i, pivot);
                break;
            }
        }

        reverse(nums, pivot + 1, n-1);

        for (int num: nums) {
            System.out.println(num);
        }
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start++, end--);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
