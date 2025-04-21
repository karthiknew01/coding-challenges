package medium;

/**
 * <a href="https://leetcode.com/problems/count-the-hidden-sequences/description/?envType=daily-question&envId=2025-04-21">...</a>
 */
public class CountHiddenSequence {

    public static void main(String[] args) {
        int[] differences = {3,-4,5,1,-2};
        int lower = -4, upper = 5;
        System.out.println(numberOfArrays(differences,lower,upper));
    }

    public static int numberOfArrays(int[] differences, int lower, int upper) {
        long min = 0, max = 0;
        long current = 0;

        for (int diff: differences) {
            current += diff;
            min = Math.min(current, min);
            max = Math.max(current, max);
        }

        long lowerBound = Math.max(lower, lower - min);
        long upperBound = Math.min(upper, upper - max);

        if (upperBound < lowerBound) {
            return 0;
        }

        return (int) (upperBound - lowerBound + 1);
    }
}
