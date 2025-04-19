package easy;

/**
 * <a href="https://leetcode.com/problems/largest-odd-number-in-string/?envType=daily-question&envId=2023-12-07">...</a>
 */
public class LargestOddNumber {

    public static void main(String[] args) {
        String output = largestOddNumber("52");
        System.out.println(output);
    }

    public static String largestOddNumber(String num) {
        int length = num.length();
        for (int i = length - 1; i >= 0; i--) {
            int c = Character.getNumericValue(num.charAt(i));
            if (c % 2 == 1)
                return num.substring(0, i + 1);
        }
        return "";
    }
}
