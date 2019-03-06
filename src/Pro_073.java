/**
 * 矩阵设为0
 */
public class Pro_073 {
    public void setZeroes(int[][] matrix) {
        int[][] temp = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0)
                    temp[i][j] = 1;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (temp[i][j] == 1) {
                    for (int m = 0; m < matrix[0].length; m++) {
                        matrix[i][m] = 0;
                    }
                    for (int m = 0; m < matrix.length; m++) {
                        matrix[m][j] = 0;
                    }
                }
            }
        }
    }
}
