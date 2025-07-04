package easy;

/**
 * <a href="https://leetcode.com/problems/find-the-original-typed-string-i/?envType=daily-question&envId=2025-07-04">...</a>
 */
public class FindOriginalTypeString1 {

    public static void main(String[] args) {
        System.out.println(possibleStringCount("ere"));
    }

    public static int possibleStringCount(String word) {
        int p = 1;
        char prev = word.charAt(0);
        for (int i = 1; i < word.length(); i++) {
            char curr = word.charAt(i);

            if (prev == curr) p++;
            else prev = curr;
        }

        return p;
    }

}
