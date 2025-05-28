package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/count-largest-group/?envType=daily-question&envId=2025-05-28">...</a>
 */
public class CountLargestGroup {

    public static void main(String[] args) {
        System.out.println(countLargestGroup(24));
    }

    public static int countLargestGroup(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 1; i <= n; i++) {
            int sum = sumOfDigits(i);
            int freq = map.getOrDefault(sum, 0) + 1;
            map.put(sum, freq);
            max = Math.max(max, freq);
        }

        int count = 0;
        for (int v: map.values())
            if (v == max) count++;

        return count;

    }

    private static int sumOfDigits(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}
