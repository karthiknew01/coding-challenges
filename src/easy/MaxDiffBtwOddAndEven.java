package easy;

public class MaxDiffBtwOddAndEven {

    public static void main(String[] args) {
        System.out.println(maxDifference("yzyyys"));
    }

    public static int maxDifference(String s) {
        int[] freq = new int[26];

        int maxOdd = 0, minEven = 100;
        for (char c: s.toCharArray())
            freq[c - 'a']++;

        for (int v: freq) {
            if (v > 0 && v % 2 == 0)
                minEven = Math.min(v, minEven);
            if (v % 2 != 0)
                maxOdd = Math.max(v, maxOdd);
        }

        return maxOdd - minEven;
    }

}
