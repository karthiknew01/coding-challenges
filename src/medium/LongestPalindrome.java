package medium;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/longest-palindromic-substring/description/">...</a>
 */
public class LongestPalindrome {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("madam"));
    }

    public static String longestPalindrome(String s) {
        for (int i = s.length(); i > 0; i--) {
            for (int j = 0; j <= s.length() - i; j++) {
                String subString = s.substring(j, i+j);
                if(isPalindrome(subString)) {
                    return subString;
                }
            }
        }

        return "";
    }

    public static boolean isPalindrome(String subString) {
        int i = 0, j = subString.length() - 1;

        while(i < j) {
            if (subString.charAt(i) != subString.charAt(j)) return false;
            i++;
            j--;
        }

        return true;
    }
}
