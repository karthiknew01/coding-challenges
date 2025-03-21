package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/generate-parentheses/description/">...</a>
 */
public class GenerateParenthesis {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }

    public static List<String> generateParenthesis(int n) {
        List<String> parenthesis = new ArrayList<>();
        dfs(0,0,"", n, parenthesis);
        return parenthesis;
    }

    public static void dfs(int i, int j, String s, int n, List<String> res) {
        if (i == j && i+j == n*2) {
            res.add(s);
            return;
        }

        if(i < n) {
            dfs(i+1, j, s + "(", n, res);
        }

        if (j < i) {
            dfs(i, j + 1, s + ")", n, res);
        }
    }


}
