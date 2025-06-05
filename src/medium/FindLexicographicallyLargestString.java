package medium;

/**
 * <a href="https://leetcode.com/problems/find-the-lexicographically-largest-string-from-the-box-i/description/?envType=daily-question&envId=2025-06-04">...</a>
 */
public class FindLexicographicallyLargestString {

    public static void main(String[] args) {
        System.out.println(answerString("dbca", 2));
    }

    public static String answerString(String word, int numFriends) {
        int n = word.length();
        String[] dp = new String[n + 1];
        dp[0] = ""; // base case

        for (int k = 1; k <= numFriends; k++) {
            String[] newDp = new String[n + 1];
            String[] suffixMax = new String[n + 2];
            suffixMax[n + 1] = "";

            // Build suffix max from right to left for previous dp
            for (int i = n; i >= 0; i--) {
                String prev = dp[i] == null ? "" : dp[i];
                suffixMax[i] = max(prev, suffixMax[i + 1]);
            }

            // Fill newDp using suffixMax
            for (int i = k; i <= n; i++) {
                String best = "";
                for (int j = k - 1; j < i; j++) {
                    String part = word.substring(j, i);
                    if (dp[j] != null) {
                        String candidate = max(dp[j], part);
                        best = max(best, candidate);
                    }
                }
                newDp[i] = best;
            }

            dp = newDp;
        }

        return dp[n];
    }

    private static String max(String a, String b) {
        if (a == null || a.isEmpty()) return b;
        if (b == null || b.isEmpty()) return a;
        return a.compareTo(b) > 0 ? a : b;
    }
}

// aann idx = 0, idx = 1,