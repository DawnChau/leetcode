package from.ant;

public class Pro_0807_Best {

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] rowMax = new int[grid.length];
        int[] colMax = new int[grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int anInt : grid[i]) {
                max = Integer.max(anInt, max);
            }
            rowMax[i] = max;
        }


        for (int i = 0; i < grid[0].length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < grid.length; j++) {
                max = Integer.max(grid[j][i], max);
            }
            colMax[i] = max;
        }

        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int min = Math.min(rowMax[i], colMax[j]);
                count += min - grid[i][j];
            }
        }

        return count;

    }
}
