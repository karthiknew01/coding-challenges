package medium;

import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/using-a-robot-to-print-the-lexicographically-smallest-string/description/?envType=daily-question&envId=2025-06-06">...</a>
 */
public class UseRobotToFindLexographicallySmall {

    public static void main(String[] args) {
        String s = "bac";
        System.out.println(robotWithString(s));
    }

    public static String robotWithString(String s) {
        StringBuilder p = new StringBuilder();
        int[] charCount = new int[26];
        char[] cArray = s.toCharArray();

        for (char c: cArray)
            charCount[c - 'a']++;

        char minChar = 'a';
        Stack<Character> t = new Stack<>();

        for (char c: cArray) {
            charCount[c - 'a']--;

            while (minChar < 'z' && charCount[minChar - 'a'] == 0) {
                minChar++;
            }

            t.push(c);

            while (!t.isEmpty() && t.peek() <= minChar)
                p.append(t.pop());

        }

        return p.toString();
    }


}
