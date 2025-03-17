package easy;

/**
 * <a href="https://leetcode.com/problems/plus-one/">...</a>
 */
public class PlusOne {

    public static void main(String[] args) {
        int[] digits = new int[] { 9,9};
        int[] result = plusOne(digits);

        for (int i : result) {
            System.out.println(i);
        }
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + 1 != 10) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;

    }
}
