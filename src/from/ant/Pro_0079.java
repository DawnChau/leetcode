package from.ant;

import java.util.concurrent.atomic.AtomicBoolean;

public class Pro_0079 {
    public boolean exist(char[][] board, String word) {
        boolean[][] used = new boolean[board.length][board[0].length];
        AtomicBoolean found = new AtomicBoolean(false);
        int index = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                used[i][j] = true;
                dfs(board, used, index, word, found, i, j);
                used[i][j] = false;
            }
        }
        return found.get();
    }

    private void dfs(char[][] board, boolean[][] used, int index, String word, AtomicBoolean found, int i, int j) {
        if (board[i][j] != word.charAt(index)) {
            return;
        }

        if (index == word.length() - 1) {
            found.set(true);
            return;
        }


        // 向上搜索
        if (i - 1 >= 0 && !used[i - 1][j]) {
            used[i - 1][j] = true;
            dfs(board, used, index + 1, word, found, i - 1, j);
            used[i - 1][j] = false;
        }

        // 向下搜索
        if (i + 1 < board.length && !used[i + 1][j]) {
            used[i + 1][j] = true;
            dfs(board, used, index + 1, word, found, i + 1, j);
            used[i + 1][j] = false;
        }

        // 向左搜索
        if (j - 1 >= 0 && !used[i][j - 1]) {
            used[i][j - 1] = true;
            dfs(board, used, index + 1, word, found, i, j - 1);
            used[i][j - 1] = false;
        }

        // 向右搜索
        if (j + 1 < board[0].length && !used[i][j + 1]) {
            used[i][j + 1] = true;
            dfs(board, used, index + 1, word, found, i, j + 1);
            used[i][j + 1] = false;
        }

    }

    public static void main(String[] args) {
        char[][] chess = new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        System.out.println(new Pro_0079().exist(chess, "ABCB"));
    }
}
