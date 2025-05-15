package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/happy-number/">...</a>
 */
public class HappyNumber {

    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }

    static Set<Integer> s = new HashSet<>();
    public static boolean isHappy(int n) {

        if (n == 1)
            return true;

        if (n < 10 && !s.add(n))
            return false;

        int sum = 0;

        while (n > 0) {
            int mod = n % 10;
            sum += mod * mod;
            n /= 10;
        }


        return isHappy(sum);
    }
}
