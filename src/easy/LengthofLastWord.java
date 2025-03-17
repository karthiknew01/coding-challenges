package easy;

/**
 * <a href="https://leetcode.com/problems/length-of-last-word/description/">...</a>
 */
public class LengthofLastWord {

    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        int result = lengthOfLastWord(s);
        System.out.println(result);
    }

    public static int lengthOfLastWord(String s) {
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
            } else if (count > 0) {
                break;
            }

        }
        return count;
    }
}
