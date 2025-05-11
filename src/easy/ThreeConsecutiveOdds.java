package easy;

/**
 * <a href="https://leetcode.com/problems/three-consecutive-odds/submissions/1630868959/?envType=daily-question&envId=2025-05-11">...</a>
 */
public class ThreeConsecutiveOdds {

    public static void main(String[] args) {
        int[] arr = { 1,2,34,3,4,5,7,23,12 };
        System.out.println(threeConsecutiveOdds(arr));
    }


    public static boolean threeConsecutiveOdds(int[] arr) {

        int seq = 0;
        for (int a: arr) {
            if (a % 2 == 1) {
                seq++;
                if (seq == 3) return true;
            } else {
                seq = 0;
            }
        }

        return false;
    }

}
