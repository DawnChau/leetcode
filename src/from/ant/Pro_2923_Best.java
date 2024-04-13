package from.ant;

public class Pro_2923_Best {
    public int findChampion(int[][] grid) {
        for (int j = 0; j < grid[0].length; j++) {
            boolean alwaysZero = true;
            for (int i = 0; i < grid.length; i++) {
                if (grid[i][j] != 0) {
                    alwaysZero = false;
                    break;
                }
            }
            if (alwaysZero) {
                return j;
            }
        }
        return -1;
    }
}
