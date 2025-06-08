package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/lexicographical-numbers/description/?envType=daily-question&envId=2025-06-08">...</a>
 */
public class LexicographicalNumbers {

    public static void main(String[] args) {
        List<Integer> n = lexicalOrder(13);

        for(int a: n) {
            System.out.println(a);
        }
    }

    static List<Integer> res = new ArrayList<>();
    public static List<Integer> lexicalOrder(int n) {
        dfs(1, res, n);
        return res;
    }

    public static void dfs(int startIndex, List<Integer> res, int n ) {
        if (startIndex > n)
            return;

        res.add(startIndex);
        dfs(startIndex * 10, res, n);
        if (startIndex % 10 != 9)
            dfs(startIndex + 1, res, n);
    }

}
