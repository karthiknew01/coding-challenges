package hard;

public class CountSubArrayWithFixedBounds {

    public static void main(String[] args) {
        int[] nums = {1,3,5,2,7,5};
        int minK = 1, maxK = 5;
        System.out.println(countSubarrays(nums, minK, maxK));
    }

    public static long countSubarrays(int[] nums, int minK, int maxK) {
        long res = 0;
        int minPos = -1, maxPos = -1, inValidPos = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == minK) minPos = i;
            if (nums[i] == maxK) maxPos = i;
            if (nums[i] < minK || nums[i] > maxK) inValidPos = i;

            if (minPos != -1 && maxPos != -1)
                res += Math.max(0, Math.min(minPos, maxPos) - inValidPos);
        }

        return res;
    }
}
