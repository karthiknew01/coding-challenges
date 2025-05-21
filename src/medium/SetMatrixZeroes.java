package medium;

/**
 * <a href="https://leetcode.com/problems/set-matrix-zeroes/?envType=daily-question&envId=2025-05-21">...</a>
 */
public class SetMatrixZeroes {

    public static void main(String[] args) {
        int[][] matrix = { {0,1,2,0}, {3,4,5,2}, {1,3,1,5}};

        System.out.println("Input ===");
        for (int[] mat : matrix) {
            for (int v : mat)
                System.out.print(v + " ");
            System.out.println();
        }
        setZeroes(matrix);


    }

    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            if (row[i]) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (col[i]) {
                for (int j = 0; j < m; j++) {
                    matrix[j][i] = 0;
                }
            }
        }

        System.out.println("Output ===");
        for (int[] mat : matrix) {
            for (int v : mat)
                System.out.print(v + " ");
            System.out.println();
        }

    }
}
