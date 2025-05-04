package easy;

/**
 * <a href="https://leetcode.com/problems/number-of-equivalent-domino-pairs/description/?envType=daily-question&envId=2025-05-04">...</a>
 */
public class NumberOfEquivalentDominosPairs {

    public static void main(String[] args) {
        int[][] dominoes = {{1,2},{2,1},{3,4},{5,6}};

        System.out.println(numEquivDominoPairs(dominoes));
    }

    public static int numEquivDominoPairs(int[][] dominoes) {
        int res = 0;
        int[] freq = new int[100];

        for (int[] d: dominoes) {
            int v1 = d[0];
            int v2 = d[1];

            int key = 10 * Math.min(v1, v2) + Math.max(v1, v2);
            res += freq[key];
            freq[key]++;
        }
        return res;
    }
}


