package from.ant;

public class Pro_2373 {
    public int[][] largestLocal(int[][] grid) {
        int[][] res = new int[grid.length - 2][grid[0].length - 2];
        for (int i = 1; i < grid.length - 1; i++) {
            for (int j = 1; j < grid[0].length - 1; j++) {
                res[i - 1][j - 1] = findMax(grid, i, j);
            }
        }
        return res;
    }

    private int findMax(int[][] grid, int i, int j) {
        int max = Integer.MIN_VALUE;
        for (int ii = i - 1; ii <= i + 1; ii++) {
            for (int jj = j - 1; jj <= j + 1; jj++) {
                if (grid[ii][jj] > max) {
                    max = grid[ii][jj];
                }
            }
        }
        return max;
    }
}
