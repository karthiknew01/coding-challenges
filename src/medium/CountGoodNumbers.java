package medium;

import java.math.BigInteger;

/**
 * <a href="https://leetcode.com/problems/count-good-numbers/submissions/1605644839/?envType=daily-question&envId=2025-04-13">...</a>
 */
public class CountGoodNumbers {

    public static void main(String[] args) {
        System.out.println(countGoodNumbers(4));
    }
    public static int countGoodNumbers(long n) {
        final int MOD = 1_000_000_007;

        long evenPosition = (n+1) / 2;
        long oddPosition = n / 2;

        BigInteger five = BigInteger.valueOf(5);
        BigInteger four = BigInteger.valueOf(4);
        BigInteger mod = BigInteger.valueOf(MOD);

        BigInteger even = five.modPow(BigInteger.valueOf(evenPosition), mod);
        BigInteger odd = four.modPow(BigInteger.valueOf(oddPosition), mod);

        BigInteger result = even.multiply(odd).mod(mod);

        return result.intValue();

    }

//    static final long MOD = 1_000_000_007;
//
//    public int countGoodNumbers(long n) {
//        long evens = (n + 1) / 2;
//        long odds = n / 2;
//
//        long pow5 = modPow(5, evens, MOD);
//        long pow4 = modPow(4, odds, MOD);
//
//        return (int)((pow5 * pow4) % MOD);
//    }
//
//    private long modPow(long base, long exp, long mod) {
//        long result = 1;
//        base %= mod;
//        while (exp > 0) {
//            if (exp % 2 == 1) result = (result * base) % mod;
//            base = (base * base) % mod;
//            exp /= 2;
//        }
//        return result;
//    }
}
