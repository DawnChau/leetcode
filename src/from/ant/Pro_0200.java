package from.ant;

public class Pro_0200 {
    public int numIslands(char[][] grid) {
        int[][] instruction = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

        boolean[][] visited = new boolean[grid.length][grid[0].length];

        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    visited[i][j] = true;
                    bfs(grid, i, j, visited, instruction);
                    count++;
                }
            }
        }
        return count;
    }

    private void bfs(char[][] grid, int i, int j, boolean[][] visited, int[][] instruction) {
        for (int m = 0; m < instruction.length; m++) {
            int x = i + instruction[m][0];
            int y = j + instruction[m][1];
            if (x < grid.length && x >= 0 && y >= 0 && y < grid[0].length && grid[x][y] == '1' && !visited[x][y]) {
                visited[x][y] = true;
                bfs(grid, x, y, visited, instruction);
            }
        }
    }
}
