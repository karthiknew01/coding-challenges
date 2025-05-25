package medium;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/longest-palindrome-by-concatenating-two-letter-words/?envType=daily-question&envId=2025-05-25">...</a>
 */
public class LongestPalindromeByConcatTwoLetter {

    public static void main(String[] args) {
        String[] words = {"ab","ty","yt","lc","cl","ab"};
        System.out.println(longestPalindrome(words));
    }

    public static int longestPalindrome(String[] words) {
        int count = 0;
        Map<String, Integer> map = new HashMap<>();
        boolean hasMiddle = false;
        for (String word: words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (String word: map.keySet()) {
            int freq = map.get(word);
            if (freq == 0)
                continue;

            String reversed = new StringBuilder(word).reverse().toString();
            if (word.equals(reversed)) {
                count += (freq / 2) * 4;
                if (freq / 2 == 1) hasMiddle = true;
            } else if(map.containsKey(reversed)) {
                int min = Math.min(freq, map.get(reversed));
                count += min * 4;
                map.put(reversed, 0);
            }

            map.put(word, 0);
        }
        
        return hasMiddle ? count + 2 : count;
    }

}
