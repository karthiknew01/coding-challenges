package medium;

/**
 * <a href="https://leetcode.com/problems/divide-two-integers/description/">...</a>
 */
public class DivideTwoIntegers {

    public static void main(String[] args) {
        System.out.println(divide(-2147483648, -3));
    }

    public static int divide(int dividend, int divisor) {
        int quotient = 0;

        if (dividend == divisor)
            return 1;

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        if (divisor == -1) return -dividend;
        if (divisor == 1) return dividend;

        long positiveDividend = Math.abs((long) dividend);
        long positiveDivisor = Math.abs((long) divisor);

        while(positiveDividend >= positiveDivisor) {
            short pow = 0;
            while(positiveDividend >= (positiveDivisor<<(pow+1)))
                pow++;

            quotient += (1<<pow);
            positiveDividend -= (positiveDivisor<<pow);
        }

        return ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)) ? -quotient : quotient;
    }


}
