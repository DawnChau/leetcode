/**
 * 矩阵中求最长递增序列
 * 深度优先遍历
 */
public class Pro_329 {

    private int[][] state = {
            {0, 1},
            {1, 0},
            {0, -1},
            {-1, 0},
    };

    public int longestIncreasingPath(int[][] matrix) {
        int row = matrix.length;
        if (row == 0)
            return 0;
        int col = matrix[0].length;

        int[][] dp = new int[row][col];
        int max = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                max = Math.max(dfs(dp, matrix, i, j), max);
            }
        }
        return max;
    }

    private int dfs(int[][] dp, int[][] matrix, int i, int j) {
        if (dp[i][j] != 0)
            return dp[i][j];
        dp[i][j] = 1;
        for (int[] s : state) {
            int x = i + s[0];
            int y = j + s[1];
            if (x >= 0 && x < matrix.length && y >= 0 && y < matrix[0].length && matrix[x][y] > matrix[i][j])
                dp[i][j] = Math.max(dp[i][j], dfs(dp, matrix, x, y) + 1);
        }
        return dp[i][j];
    }
}
