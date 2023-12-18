package hard;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/regular-expression-matching/description/
 */
public class RegularExpressionMatch {

    public static void main(String[] args) {
        String s = "aa", p = "a";
        System.out.println(isMatch(s,p));
    }

    public static boolean isMatch(String s, String p) {
        // Top Down Memorization
        dp = new int[s.length()][p.length()];
        return dfs(0,0, s, p) == 1;
    }

    static int[][] dp;
    public static int dfs(int i, int j, String s, String p) {
        if (i >= s.length() && j >= p.length())
            return 1;
        if (j >= p.length())
            return -1;

        if (dp[i][j] != 0) {
            return dp[i][j];
        }

        boolean match = i < s.length() && (p.charAt(j) == '.' || s.charAt(i) ==  p.charAt(j));

        if ((j+1) < p.length() && p.charAt(j+1) == '*') {
            int result = dfs(i, j+2, s, p);
            int result2 = match ? dfs(i+1,j,s,p) : -1;
            dp[i][j] = Math.max(result, result2);
            return dp[i][j];
        }

        if (match) {
            dp[i][j] = dfs(i + 1, j + 1, s, p);
            return dp[i][j];
        }

        return -1;
    }



}
