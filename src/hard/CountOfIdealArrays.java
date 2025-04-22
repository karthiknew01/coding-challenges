package hard;


/**
 * <a href="https://leetcode.com/problems/count-the-number-of-ideal-arrays/?envType=daily-question&envId=2025-04-21">...</a>
 */
public class CountOfIdealArrays {

    public static void main(String[] args) {
        System.out.println(idealArrays(2,5));
    }

    public static int idealArrays(int n, int maxValue) {
        int MOD = 1_000_000_007;
        long[][] count = new long[15][10001];
        long[][] prefix = new long[15][10001];
        long[] operations = new long[15];
        for (int i = 1; i < 10001; i++) {
            count[1][i] = 1;
            prefix[1][i] = i;
        }

        for (int i = 2; i < 15; i++) {
            for (int j = 1; j < 10001; j++) {
                count[i][j] = prefix[i - 1][j - 1];
                prefix[i][j] = count[i][j] + prefix[i][j-1];
                count[i][j] %= MOD;
                prefix[i][j] %= MOD;
            }
        }


        for (int i = 1; i <= maxValue; i++) {
            countUniqueSequences(i, 1, maxValue, operations);
        }

        long res = 0;
        long ways;

        for (int i = 1; i < 15; i++) {
            ways = count[i][n] * operations[i];
            ways %= MOD;
            res += ways;
            res %= MOD;
        }


        return (int) res;
    }

    public static void countUniqueSequences(int i, int index, int maxValue, long[] operations) {
        operations[index] += 1;
        for (int j = 2; i * j <= maxValue; ++j ) {
            countUniqueSequences(i*j, index+1, maxValue, operations);
        }
    }
}
