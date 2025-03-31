package hard;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/put-marbles-in-bags/description/?envType=daily-question&envId=2025-03-31">...</a>
 */
public class PutMarblesBags {

    public static void main(String[] args) {
        int[] weights = new int[] {1, 3};
        System.out.println(putMarbles(weights, 2));
    }

    public static long putMarbles(int[] weights, int k) {
        int n = weights.length;
        int[] weightedPairs = new int[n-1];

        for (int i = 0; i < n - 1; i++) {
            weightedPairs[i] = weights[i] + weights[i+1];
        }

        Arrays.sort(weightedPairs);

        long result = 0;
        for (int j = 0; j < k -1; j++) {
            result += weightedPairs[n - 2 - j] - weightedPairs[j];
        }

        return result;
    }

}
