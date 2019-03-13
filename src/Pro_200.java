/**
 * 广度优先遍历
 */
public class Pro_200 {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0)
            return 0;

        int row = grid.length;
        int col = grid[0].length;

        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    combine(grid, i, j);
                }
            }
        }
        return count;
    }

    private void combine(char[][] grid, int i, int j) {
        grid[i][j] = '2';
        if (i > grid.length - 1 && j > grid[0].length - 1) {
            return;
        }

        // 向下
        if (i < grid.length - 1 && grid[i + 1][j] == '1')
            combine(grid, i + 1, j);

        // 向上
        if (i > 0 && grid[i - 1][j] == '1')
            combine(grid, i - 1, j);

        // 向左
        if (j > 0 && grid[i][j - 1] == '1')
            combine(grid, i, j - 1);

        // 向右
        if (j < grid[0].length - 1 && grid[i][j + 1] == '1')
            combine(grid, i, j + 1);

    }
}
