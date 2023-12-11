package unknown;

import java.util.Arrays;

public class CountingBits {

    public static void main(String[] args) {
        int num = 5;
        int[] count = countBits(num);
        System.out.println(Arrays.toString(count));
    }

    public static int[] countBits(int n) {
        int[] count = new int[n+1];
        count[0] = 0;
        for (int i = 1; i <= n; i++) {
            count[i] = i % 2 + count[i/2];
        }
        return count;
    }
}
