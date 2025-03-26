package easy;

/**
 * <a href="https://leetcode.com/problems/single-number/">...</a>
 */
public class SingleNumber {

    public static void main(String[] args) {
       int[] nums = new int[] { 4,1,2,1,2 };
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
//        Set<Integer> entry = new HashSet<>();
//        for (int num : nums) {
//            if (!entry.contains(num))
//                entry.add(num);
//            else
//                entry.remove(num);
//        }
//
//        return entry.iterator().next();
        int res = 0;

        for (int num: nums) {
            res ^= num;
        }

        return res;
    }

}
