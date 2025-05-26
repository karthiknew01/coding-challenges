package hard;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/substring-with-concatenation-of-all-words/description/">...</a>
 */
public class SubStringWithConcatenationOfAllWords {

    public static void main(String[] args) {
       String s = "barfoothefoobarman";
       String[] words = {"foo", "bar"};
       List<Integer> indices = findSubstring(s, words);
       for(int i: indices)
           System.out.println(i);
    }

    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> indices = new ArrayList<>();

        if (s.isEmpty() || words.length == 0)
            return indices;

        Map<String, Integer> map = new HashMap<>();

        for (String word: words)
            map.put(word, map.getOrDefault(word, 0) + 1);

        int wordSize = words[0].length();
        int wordCount = words.length;
        int n = s.length();

        for (int offset = 0; offset < wordSize; offset++) {
            Map<String, Integer> curr = new HashMap<>();
            int start = offset;
            int count = 0;
            for (int end = offset; end + wordSize <= n; end+=wordSize) {
                String currWord = s.substring(end, end + wordSize);
                if (map.containsKey(currWord)) {
                    curr.put(currWord, curr.getOrDefault(currWord, 0) + 1);
                    count++;

                    while (curr.get(currWord) > map.get(currWord)) {
                        String startWord = s.substring(start, start + wordSize);
                        curr.put(startWord, curr.get(startWord) - 1);
                        start += wordSize;
                        count--;
                    }

                    if (count == wordCount) {
                        indices.add(start);
                    }

                } else {
                    count = 0;
                    start = end + wordSize;
                    curr.clear();

                }
            }

        }

        return indices;
    }




}
