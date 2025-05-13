package medium;

/**
 * <a href="https://leetcode.com/problems/total-characters-in-string-after-transformations-i/?envType=daily-question&envId=2025-05-12">...</a>
 */
public class TotalCharactersAfterTransformation {

    public static void main(String[] args) {
        String s = "abcyy";
        int t = 2;
        System.out.println(lengthAfterTransformations(s, t));
    }

    public static int lengthAfterTransformations(String s, int t) {
        int count = 0;

        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        final int MOD = 1_000_000_007;

        for(int i = 0; i < t; i++) {
            int z = freq[25];
            for (int j = 25; j > 0; j--) {
                freq[j] = freq[j - 1];
            }

            freq[0] = z % MOD;
            freq[1] = (freq[1] + z) % MOD;
        }

        for (int f: freq) {
            count += f;
            count %= MOD;
        }

        return count;
    }

}
