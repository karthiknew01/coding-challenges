package easy;

/**
 * <a href="https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/?envType=daily-question&envId=2025-05-27">...</a>
 */
public class DivAndNonDivDifference {

    public static void main(String[] args) {
        int n = 10, m = 3;
        System.out.println(differenceOfSums(n,m));
    }

    public static int differenceOfSums(int n, int m) {
        int diff = 0;

        for (int i = 1; i <= n; i++) {
            if (i % m == 0)
                diff-=i;
            else
                diff+=i;
        }

        return diff;
    }

}
