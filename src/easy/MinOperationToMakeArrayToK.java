package easy;

import java.util.HashSet;
import java.util.Set;

public class MinOperationToMakeArrayToK {

    public static void main(String[] args) {
        int[] nums = { 5, 4, 2 ,5, 5 };
        int k = 2;
        System.out.println(minOperations(nums, k));
    }

    public static int minOperations(int[] nums, int k) {
        int operations = 0;
        Set<Integer> set = new HashSet<>();
        set.add(k);
        for (int n: nums) {
            if (n < k)
                return -1;

            if (set.add(n))
                operations++;
        }


        return operations;
    }

}
