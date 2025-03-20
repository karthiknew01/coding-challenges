package easy;


/**
 * <a href="https://leetcode.com/problems/sqrtx/description/">...</a>
 */
public class Sqrt {

    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }

    public static int mySqrt(int x) {
        int i = 1;
        int j = x;

        while (i <= j) {
            int mid = i + (j-i) / 2;

            if ((long)mid * mid == (long)x) {
                return mid;
            }

            if ((long)mid * mid < (long)x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return j;
    }
}
