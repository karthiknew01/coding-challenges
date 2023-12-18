package medium;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/longest-palindromic-substring/description/">...</a>
 */
public class LongestPalindrome {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }


    public static String longestPalindrome(String s) {
        String palindromeString = "";
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            int left = i, right = i;
            // Odd condition
            while(left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > maxLength) {
                    palindromeString = s.substring(left, right + 1);
                    maxLength = right - left + 1;
                }
                left -= 1;
                right +=1;
            }

            // even condition
            left = i;
            right = i+1;
            while(left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > maxLength) {
                    palindromeString = s.substring(left, right + 1);
                    maxLength = right - left + 1;
                }
                left -= 1;
                right +=1;
            }
        }

        return palindromeString;

    }
}
