package from.ant;

import java.util.concurrent.atomic.AtomicInteger;

public class Pro_0064 {

    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        dp[0][0] = grid[0][0];

        // 填充第一列
        for (int i = 1; i < grid.length; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }

        // 填充第一行
        for (int i = 1; i < grid[0].length; i++) {
            dp[0][i] = dp[0][i - 1] + grid[0][i];
        }

        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                dp[i][j] = grid[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[grid.length - 1][grid[0].length - 1];
    }


    // 超时
    public int minPathSum1(int[][] grid) {
        AtomicInteger minNum = new AtomicInteger(Integer.MAX_VALUE);
        int m = grid.length - 1;
        int n = grid[0].length - 1;
        int sum = grid[0][0];
        backTracing(grid, 0, 0, minNum, m, n, sum);
        return minNum.get();
    }

    private void backTracing(int[][] grid, int x, int y, AtomicInteger minNum, int m, int n, int sum) {
        if (x == m && y == n) {
            minNum.set(Math.min(minNum.get(), sum));
            return;
        }

        // 剪枝
        if (sum >= minNum.get()) {
            return;
        }

        // 向右
        if (y < n) {

            sum += grid[x][y + 1];
            backTracing(grid, x, y + 1, minNum, m, n, sum);
            sum -= grid[x][y + 1];
        }

        // 向下
        if (x < m) {
            sum += grid[x + 1][y];
            backTracing(grid, x + 1, y, minNum, m, n, sum);
            sum -= grid[x + 1][y];
        }
    }

    public static void main(String[] args) {
        int[][] grid = new int[][]{
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };

        System.out.println(new Pro_0064().minPathSum(grid));
    }
}
