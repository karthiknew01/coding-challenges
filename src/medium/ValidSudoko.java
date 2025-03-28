package medium;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/valid-sudoku/">...</a>
 */
public class ValidSudoko {

    public static void main(String[] args) {
        char[][] board = {
                {'.', '.', '4', '.', '.', '.', '6', '3', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'5', '.', '.', '.', '.', '.', '.', '9', '.'},
                {'.', '.', '.', '5', '6', '.', '.', '.', '.'},
                {'4', '.', '3', '.', '.', '.', '.', '.', '1'},
                {'.', '.', '.', '7', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '5', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'}
        };

        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(board[i][j] == '.') continue;
                String curr = "(" + board[i][j] + ")";
                if (!seen.add(curr + i) ||  !seen.add(j + curr) || !seen.add((i / 3 ) + curr + (j/3)))
                    return false;
            }
        }

        return true;
    }

}
