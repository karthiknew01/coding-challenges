package easy;

/**
 * https://leetcode.com/problems/largest-odd-number-in-string/?envType=daily-question&envId=2023-12-07
 */
public class LargestOddNumber {

    public static void main(String[] args) {
        String output = largestOddNumber("52");
        System.out.println(output);
    }

    public static String largestOddNumber(String num) {
        int length = num.length();
        for (int i = 1; i <= length; i++) {
            if ((num.charAt(length - i) - 48) % 2 == 1)
                return num.substring(0,length - i + 1);

        }
        return "";
    }
}
