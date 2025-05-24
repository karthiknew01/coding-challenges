package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/find-words-containing-character/description/?envType=daily-question&envId=2025-05-24">...</a>
 */
public class FindWordsContainingCharacter {

    public static void main(String[] args) {
        String[] words = {"abc","bcd","aaaa","cbc"};
        char x = 'a';
        List<Integer> res = findWordsContaining(words, x);
        for (int r: res) {
            System.out.println(r);
        }
    }

    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1)
                res.add(i);
        }
        return res;
    }

}
