package from.ant;

import java.util.Arrays;

public class Pro_2500 {
    public int deleteGreatestValue(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            Arrays.sort(grid[i]);
        }

        int ans = 0;
        for (int j = 0; j < grid[0].length; j++) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < grid.length; i++) {
                if(grid[i][j] > max){
                    max = grid[i][j];
                }
            }
            ans+=max;
        }
        return ans;
    }
}
