package easy;

/**
 * <a href="https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/?envType=daily-question&envId=2025-04-28">...</a>
 */
public class FindNumbersWithEvenDigits {

    public static void main(String[] args) {
        int[] num = {555,901,482,1771};
        System.out.println(findNumbers(num));
    }

    public static int findNumbers(int[] nums) {
        int res = 0;

        for (int num : nums) {
            String value = String.valueOf(num);
            if (value.length() % 2 == 0) res++;
        }

        return res;
    }

}
