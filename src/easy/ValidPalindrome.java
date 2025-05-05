package easy;

public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("madamimadam"));
    }

    public static boolean isPalindrome(String s) {
        int left = 0, right  = s.length() - 1;
        while (left < right) {
            char c1 = s.charAt(left);
            char c2 = s.charAt(right);
            if (!Character.isLetterOrDigit(c1)) {
                left++;
            } else if (!Character.isLetterOrDigit(c2)) {
                right--;
            } else {
                if (Character.toLowerCase(c1) != Character.toLowerCase(c2))
                    return false;

                left++;
                right--;
            }
        }

        return true;
    }

}
