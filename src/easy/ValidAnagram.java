package easy;

import java.util.*;

public class ValidAnagram {

    /**
     * <a href="https://leetcode.com/problems/valid-anagram/submissions/1122877218/">...</a>
     */
    public static void main(String[] args) {
        String s = "aa", t = "bb";
        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        List<Character> sList = new ArrayList<>();
        List<Character> tList = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);

            if (s1 != t1) {
                int sIndex = tList.indexOf(s1);
                if (sIndex >= 0) {
                    tList.remove(sIndex);
                } else {
                    sList.add(s1);
                }

                int tIndex = sList.indexOf(t1);
                if (tIndex >= 0) {
                    sList.remove(tIndex);
                } else {
                    tList.add(t1);
                }
            }
        }

        return sList.size() == 0;
    }
}
