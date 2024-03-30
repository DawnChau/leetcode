package from.ant;

public class Pro_2482 {
    public int[][] onesMinusZeros(int[][] grid) {
        int[][] res = new int[grid.length][grid[0].length];
        int[] oneRow = new int[grid.length];
        int[] zeroRow = new int[grid.length];
        for (int i = 0; i < grid.length; i++) {
            int oneCount = 0;
            int zeroCount = 0;
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    zeroCount++;
                } else {
                    oneCount++;
                }
            }
            oneRow[i] = oneCount;
            zeroRow[i] = zeroCount;
        }

        int[] oneCol = new int[grid[0].length];
        int[] zeroCol = new int[grid[0].length];
        for (int j = 0; j < grid[0].length; j++) {
            int oneCount = 0;
            int zeroCount = 0;
            for (int i = 0; i < grid.length; i++) {
                if (grid[i][j] == 0) {
                    zeroCount++;
                } else {
                    oneCount++;
                }
            }
            oneCol[j] = oneCount;
            zeroCol[j] = zeroCount;
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                res[i][j] = oneRow[i] + oneCol[j] - zeroRow[i] - zeroCol[j];
            }
        }
        return res;
    }
}
