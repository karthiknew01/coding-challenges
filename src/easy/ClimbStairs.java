package easy;

/**
 * <a href="https://leetcode.com/problems/climbing-stairs/">...</a>
 */
public class ClimbStairs {

    public static void main(String[] args) {
        System.out.println(climbStairs(2));
    }

    public static int climbStairs(int n) {
        if (n <= 1) return n;

        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;

        int i = 2;
        while (i < n) {
            dp[i] = dp[i-2] + dp[i-1];
            i++;
        }

        return dp[n-1];
    }
}
