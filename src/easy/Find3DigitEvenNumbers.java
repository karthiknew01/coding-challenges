package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/finding-3-digit-even-numbers/description/?envType=daily-question&envId=2025-05-12">...</a>
 */
public class Find3DigitEvenNumbers {

    public static void main(String[] args) {
        int[] digits = {2,2,8,8,2};

        int[] res = findEvenNumbers(digits);

        for (int r: res)
            System.out.println(r);
    }

    public static int[] findEvenNumbers(int[] digits) {
        int[] freq = new int[10];

        for (int d: digits) freq[d]++;

        List<Integer> res = new ArrayList<>();

        for (int i = 100; i < 999; i+=2) {
            int a = i / 100;
            int b = (i / 10) % 10;
            int c = i % 10;

            freq[a]--; freq[b]--; freq[c]--;

            if (freq[a] >= 0 && freq[b] >= 0 && freq[c] >= 0)
                res.add(i);

            freq[a]++; freq[b]++; freq[c]++;
        }

        int[] out = new int[res.size()];

        for (int i = 0; i < res.size(); i++) {
            out[i] = res.get(i);
        }

        return out;
    }

}
