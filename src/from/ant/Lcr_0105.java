package from.ant;

import java.util.concurrent.atomic.AtomicInteger;

public class Lcr_0105 {
    public int maxAreaOfIsland(int[][] grid) {
        int[][] direct = new int[][]{
                {0, 1}, {1, 0}, {0, -1}, {-1, 0}
        };
        int max = 0;
        boolean[][] used = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1 && !used[i][j]) {
                    AtomicInteger count = new AtomicInteger(0);
                    bfs(grid, i, j, used, count, direct);
                    max = Math.max(max, count.get());
                }
            }
        }
        return max;
    }

    private void bfs(int[][] grid, int i, int j, boolean[][] used, AtomicInteger count, int[][] direct) {
        used[i][j] = true;
        count.set(count.get() + 1);
        for (int n = 0; n < direct.length; n++) {
            int newX = i + direct[n][0];
            int newY = j + direct[n][1];
            if (newX >= 0 && newX < grid.length && newY >= 0 && newY < grid[0].length &&
                    grid[newX][newY] == 1 && !used[newX][newY]) {
                bfs(grid, newX, newY, used, count, direct);
            }
        }
    }

    public static void main(String[] args) {
        int[][] grid = new int[][]{
                {0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}
        };
        System.out.println(new Lcr_0105().maxAreaOfIsland(grid));
    }
}
