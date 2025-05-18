package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/longest-unequal-adjacent-groups-subsequence-i/description/?envType=daily-question&envId=2025-05-18">...</a>
 */
public class LongestUnequalAdjGroupSequence {

    public static void main(String[] args) {
        String[] words = {"e","a","b"};
        int[] groups = {0,0,1};
        System.out.println(getLongestSubsequence(words, groups));
    }

    public static List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> res = new ArrayList<>();
        res.add(words[0]);
        for (int i = 1; i < groups.length; i++) {

            if (groups[i] != groups[i -1]) {
                res.add(words[i]);
            }
        }

        return res;
    }

}
