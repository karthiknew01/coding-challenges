package hard;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/find-the-count-of-good-integers/?envType=daily-question&envId=2025-04-12">...</a>
 */
public class CountGoodIntegers {

    public static void main(String[] args) {
        System.out.println(countGoodIntegers(5,6));
    }

    public static long countGoodIntegers(int n, int k) {
        Set<String> set = new HashSet<>();
        long goodInt = 0;
        int pow = (int) Math.pow(10, (double) (n - 1) / 2);
        int skip = n & 1;
        for (int i = pow; i < pow * 10; i++) {
            String val = Integer.toString(i);
            val += new StringBuilder(val).reverse().substring(skip);
            char[] chars = val.toCharArray();
            Arrays.sort(chars);
            long palindrome = Long.parseLong(val);
            if (palindrome % k == 0) {
                char[] ch = val.toCharArray();
                Arrays.sort(ch);
                set.add(new String(ch));
            }
        }

        long[] fact = new long[n + 1];
        fact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i - 1] * i;
        }

        for (long f: fact)
            System.out.println(f);

        for (String s: set) {
            int[] count = new int[10];
            for (char c : s.toCharArray()) {
                count[c - 48]++;            }
            long total = (n-count[0]) * fact[n - 1];
            for (int x: count) {
                total /= fact[x];
            }

            goodInt += total;
        }

        return goodInt;
    }
}
