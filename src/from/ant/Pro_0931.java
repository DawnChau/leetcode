package from.ant;

public class Pro_0931 {
    public int minFallingPathSum(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            dp[0][i] = matrix[0][i];
        }

        int min = Integer.MAX_VALUE;
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (j == 0) {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j + 1]) + matrix[i][j];
                } else if (j == matrix.length - 1){
                    dp[i][j] = Math.min(dp[i - 1][j - 1], dp[i - 1][j]) + matrix[i][j];
                }else{
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1], dp[i - 1][j]), dp[i - 1][j + 1]) + matrix[i][j];
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            min = Math.min(dp[matrix.length - 1][i], min);
        }
        return min;
    }
}
