package medium;

import java.util.Arrays;

public class PartitionArrayThatMaxDiffIsK {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int k = 1;
        System.out.println(partitionArray(nums, k));
    }

    public static int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int begin = 0, count = 0;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] - nums[begin] > k) {
                count++;
                begin = i;
            }
        }

        count++;

        return count;
    }
}
