package medium;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/solving-questions-with-brainpower/description/?envType=daily-question&envId=2025-04-01">...</a>
 */
public class SolvingQuestionWithBrianPower {

    public static void main(String[] args) {
        int[][] questions = {{3, 2}, {4, 3}, {4, 4}, {2, 5}};
        System.out.println(mostPoints(questions));
    }

    public static long mostPoints(int[][] questions) {
        int n = questions.length;
        long[] dp = new long[n];
        Arrays.fill(dp, -1);
        return dfs(questions, 0, dp, n);
    }

    public static long dfs(int[][] questions, int i, long[] dp, int n) {
        if (i >= n) return 0;
        if (dp[i] != -1) return dp[i];

        long take = questions[i][0] + dfs(questions, i+ questions[i][1] + 1, dp, n);
        long skip = dfs(questions, i+1, dp, n);

        return dp[i] = Math.max(take, skip);
    }

}
