package from.ant;

import java.util.LinkedList;
import java.util.Queue;

public class Pro_0695 {

    private int count = 0;

    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int[][] instruction = new int[][]{{ -1, 0 },{ 1, 0 },{ 0, 1 },{ 0, -1 } } ;
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    Queue<Integer> queue = new LinkedList<>();
                    queue.offer(i);
                    queue.offer(j);
                    visited[i][j] = true;
                    count++;
                    bfs(grid, visited, instruction, queue);
                    res = Math.max(res, count);
                }
            }
        }
        return res;
    }

    private void bfs(int[][] grid, boolean[][] visited, int[][] instruction, Queue<Integer> queue) {
        while (!queue.isEmpty()) {
            int i = queue.poll();
            int j = queue.poll();
            for (int m = 0; m < 4; m++) {
                int x = i + instruction[m][0];
                int y = j + instruction[m][1];
                if (x >= grid.length || y >= grid[0].length || x < 0 || y < 0) {
                    continue;
                }
                if (grid[x][y] == 1 && !visited[x][y]) {
                    queue.offer(x);
                    queue.offer(y);
                    visited[x][y] = true;
                    count++;
                }
            }
        }

    }
}
