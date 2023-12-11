package unknown;

import java.util.Arrays;

public class ArrayPairSum {

    public static void main(String[] args) {
        int[] nums = new int[] {6,2,6,5,1,2};
        int sum = arrayPairSum(nums);
        System.out.println(sum);
    }

    public static int arrayPairSum(int[] nums) {
        int sum = 0;
        nums = Arrays.stream(nums).sorted().toArray();

        for (int i = 0; i < nums.length; i=i+2) {
            sum += nums[i];
        }

        return sum;
    }
}
