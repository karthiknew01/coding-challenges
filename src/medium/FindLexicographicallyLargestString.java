package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/find-the-lexicographically-largest-string-from-the-box-i/description/?envType=daily-question&envId=2025-06-04">...</a>
 */
public class FindLexicographicallyLargestString {

    public static void main(String[] args) {
        System.out.println(answerString("nbjnc", 2));
    }

    static String maxString = "";

    public static String answerString(String word, int numFriends) {
        maxString = "";
        dfs(word, 0, numFriends, new ArrayList<>());
        return maxString;
    }

    public static void dfs(String word, int start, int partsLeft, List<String> current) {
        int n = word.length();

        if (n - start < partsLeft) return;

        if (partsLeft == 1) {
            String lastPart = word.substring(start);
            current.add(lastPart);
            for (String part : current) {
                if (part.compareTo(maxString) > 0) {
                    maxString = part;
                }
            }
            current.removeLast();
            return;
        }

        // Try all possible cuts
        for (int i = start + 1; i <= n - partsLeft + 1; i++) {
            String part = word.substring(start, i);
            current.add(part);
            dfs(word, i, partsLeft - 1, current);
            current.removeLast();
        }
    }
}

// aann idx = 0, idx = 1,