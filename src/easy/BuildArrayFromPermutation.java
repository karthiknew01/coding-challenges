package easy;

public class BuildArrayFromPermutation {

    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        int[] res = buildArray(nums);

        for(int r: res)
            System.out.println(r);
    }

    public static int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = nums[nums[i]];
        }

        return res;
    }

}
