package medium;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/valid-sudoku/">...</a>
 */
public class ValidSudoko {

    public static void main(String[] args) {
        char[][] board = {
                {'8', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                String curr = "(" + board[i][j] + ")";
                if (!curr.equals("(.)") && (!seen.add(curr + i) ||  !seen.add(j + curr) || !seen.add((i / 3 ) + curr + (j/3))))
                    return false;
            }
        }

        return true;
    }

}
