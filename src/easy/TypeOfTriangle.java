package easy;

/**
 * <a href="https://leetcode.com/problems/type-of-triangle/?envType=daily-question&envId=2025-05-22">...</a>
 */
public class TypeOfTriangle {

    public static void main(String[] args) {
        int[] nums = {5, 3, 8};
        System.out.println(triangleType(nums));
    }

    public static String triangleType(int[] nums) {
        int a = nums[0], b = nums[1], c = nums[2];

        if (a == b && b == c) {
            return "equilateral";
        } else {

           if (a + b <= c || b + c <= a || a + c <= b)
               return "none";

           if (a == b || b == c || a == c) {
                return "isosceles";
           } else {
                return "scalene";
           }
        }
    }

}
