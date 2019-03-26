import javafx.util.Pair;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Pro_130 {

    private int[][] d = {
            {0, 1},
            {0, -1},
            {1, 0},
            {-1, 0}
    };
    private int m;
    private int n;

    public void solve(char[][] board) {
        m = board.length;
        if (m == 0)
            return;
        n = board[0].length;
        if (n == 0)
            return;

        boolean[][] visited = new boolean[m][n];
        List<Pair<Integer, Integer>> record = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O' && !visited[i][j]) {
                    // 清空一下记录
                    record.clear();
                    if (bfs(board, i, j, visited, record)) {
                        for (int k = 0; k < record.size(); k++) {
                            board[record.get(k).getKey()][record.get(k).getValue()] = 'X';
                        }
                    }
                }
            }
        }
        return;
    }

    private boolean bfs(char[][] board, int i, int j, boolean[][] visited, List<Pair<Integer, Integer>> record) {
        Queue<Pair<Integer, Integer>> queue = new LinkedList<>();
        boolean res = true;
        visited[i][j] = true;
        queue.add(new Pair<>(i, j));
        while (!queue.isEmpty()) {
            Pair<Integer, Integer> pair = queue.poll();
            record.add(pair);
            for (int x = 0; x < 4; x++) {
                int newX = pair.getKey() + d[x][0];
                int newY = pair.getValue() + d[x][1];
                if (!inArea(newX, newY)) {
                    res = false;
                } else if (board[newX][newY] == 'O' && !visited[newX][newY]) {
                    visited[newX][newY] = true;
                    queue.add(new Pair<>(newX, newY));
                }
            }
        }
        return res;
    }

    private boolean inArea(int x, int y) {
        return x >= 0 && y >= 0 && x < m && y < n;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        new Pro_130().solve(board);
    }
}
