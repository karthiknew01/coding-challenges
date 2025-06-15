package easy;

/**
 * <a href="https://leetcode.com/problems/maximum-difference-by-remapping-a-digit/description/?envType=daily-question&envId=2025-06-14">...</a>
 */
public class MaxDiffByReplacingADigit {

    public static void main(String[] args) {
        System.out.println(minMaxDifference(11891));
    }

    public static int minMaxDifference(int num) {

        String numString = String.valueOf(num);

        int replaceMin = Character.getNumericValue(numString.charAt(0)), replaceMax = -1;
        int max = 0, min = 0;

        for (int i = 0; i < numString.length(); i++) {
            int c = Character.getNumericValue(numString.charAt(i));
            max *= 10;
            min *= 10;

            if (replaceMax == -1 && c != 9)
                replaceMax = c;

            if (replaceMax == c) {
                max += 9;
            } else {
                max += c;
            }

            if (c != replaceMin) {
                min += c;
            }
        }

        return max - min;
    }

}
