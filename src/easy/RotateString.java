package easy;

/**
 * <a href="https://leetcode.com/problems/rotate-string/description/?envType=daily-question&envId=2025-03-30">...</a>
 */
public class RotateString {

    public static void main(String[] args) {
        String s = "gcmbf", goal = "fgcmb";
        System.out.println(rotateString(s, goal));
    }

    public static boolean rotateString(String s, String goal) {
        if (s.equals(goal)) return true;
        if (s.length() != goal.length()) return false;

        for (int i = 1; i < s.length(); i++) {
            s = s.substring(1).concat(s.substring(0, 1));
            if (goal.equals(s))
                return true;
        }

        return false;
    }
}
