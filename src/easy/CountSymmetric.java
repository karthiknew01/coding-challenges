package easy;

/**
 * <a href="https://leetcode.com/problems/count-symmetric-integers/description/?envType=daily-question&envId=2025-04-11">...</a>
 */
public class CountSymmetric {

    public static void main(String[] args) {
        System.out.println(countSymmetricIntegers(1,10000));
    }



    public static int countSymmetricIntegers(int low, int high) {
        int symmetric = 0;

        low = Math.max(low, 11);
        high = Math.min(high, 9999);
        for (int i = low; i <= high; i++) {
            String val = Integer.toString(i);
            int length = val.length();
            if (length % 2 != 0)
                i = 999;
            if (length % 2 == 0 && checkSum(val))
                symmetric++;
        }

        return symmetric;
    }


    public static boolean checkSum(String s) {
        int sum = 0;
        int mid = s.length() / 2;
        for (int i = 0; i < mid; i++) {
            sum += s.charAt(i) - s.charAt(i + mid);
        }
        return sum == 0;
    }

}
