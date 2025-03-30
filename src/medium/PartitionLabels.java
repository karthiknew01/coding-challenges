package medium;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/partition-labels/description/?envType=daily-question&envId=2025-03-30">...</a>
 */
public class PartitionLabels {

    public static void main(String[] args) {
        String s = "eccbbbbdec";
        List<Integer> list = partitionLabels(s);

        for (int l: list) {
            System.out.println(l);
        }
    }

    public static List<Integer> partitionLabels(String s) {
        List<Integer> list = new ArrayList<>();
        Map<Character, Integer> m = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            m.put(s.charAt(i), i);
        }

        int maxLength = 0;
        int nextPartition = 0;
        for (int j = 0; j < s.length(); j++) {
            maxLength = Math.max(maxLength, m.get(s.charAt(j)));
            if (maxLength == j) {
                list.add(j - nextPartition + 1);
                nextPartition = j + 1;
            }
        }

        return list;
    }

}
