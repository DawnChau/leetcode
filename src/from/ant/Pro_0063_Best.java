package from.ant;

public class Pro_0063_Best {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];

        // 初始化第一行
        for (int i = 0; i < obstacleGrid[0].length; i++) {
            // 有障碍，后边的全部过不去
            if (obstacleGrid[0][i] == 1) {
                break;
            } else {
                dp[0][i] = 1;
            }
        }

        // 初始化第一列
        for (int i = 0; i < obstacleGrid.length; i++) {
            // 有障碍，后边的全部过不去
            if (obstacleGrid[i][0] == 1) {
                break;
            } else {
                dp[i][0] = 1;
            }
        }

        for (int i = 1; i < obstacleGrid.length; i++) {
            for (int j = 1; j < obstacleGrid[0].length; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }

        return dp[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
    }

    public static void main(String[] args) {
        int[][] nums = new int[][]{{0, 0}};
        System.out.println(new Pro_0063_Best().uniquePathsWithObstacles(nums));
    }
}
