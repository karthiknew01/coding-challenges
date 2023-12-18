package medium;

import java.awt.desktop.AboutEvent;

/**
 * https://leetcode.com/problems/string-to-integer-atoi/description/
 */
public class MyAtoi {

    public static void main(String[] args) {
        String s = " -42a1234";
        System.out.println(myAtoi(s));
    }

    public static int myAtoi(String s) {
        double atoi = 0;
        boolean isNegative = false;
        boolean shouldContinue = true;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (shouldContinue) {
                if (c == ' ') {
                    continue;
                }

                if (c == '-') {
                    isNegative = true;
                    shouldContinue = false;
                    continue;
                }

                if (c == '+') {
                    shouldContinue = false;
                    continue;
                }
            }

            if (c >= '0' && c <= '9') {
                shouldContinue = false;
                if (isNegative) {
                    atoi = atoi * 10 - (c - '0');
                    atoi = Math.max(atoi, Integer.MIN_VALUE);
                    System.out.println(atoi);
                } else {
                    atoi = (atoi * 10 + (c - '0'));
                    atoi = Math.min(atoi, Integer.MAX_VALUE);
                }

                continue;
            }
            break;
        }
        return (int) atoi;
    }
}
