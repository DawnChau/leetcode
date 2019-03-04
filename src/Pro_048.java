/**
 * 原地矩阵顺时针旋转90度
 * 先对角线翻转，再左右翻转
 */
public class Pro_048 {
    public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < (matrix[0].length + 1) / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - i - 1];
                matrix[i][matrix.length - i - 1] = temp;
            }
        }
    }
}
