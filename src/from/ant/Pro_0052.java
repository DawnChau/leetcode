package from.ant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pro_0052 {
    public int totalNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] chess = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(chess[i], '.');
        }
        backTracing(ans, chess, n, 0);
        return ans.size();
    }

    private void backTracing(List<List<String>> ans, char[][] chess, int n, int row) {
        if (row == n) {
            List<String> path = new ArrayList<>();
            for (char[] chars : chess) {
                path.add(new String(chars));
            }
            ans.add(path);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (isValid(row, i, chess)) {
                chess[row][i] = 'Q';
                backTracing(ans, chess, n, row + 1);
                chess[row][i] = '.';
            }
        }
    }

    private boolean isValid(int row, int col, char[][] chess) {
        // 竖着
        for (int i = 0; i < chess.length; i++) {
            if (chess[i][col] == 'Q') {
                return false;
            }
        }

        // 左上
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] == 'Q') {
                return false;
            }
        }

        // 右上
        for (int i = row, j = col; i >= 0 && j < chess.length; i--, j++) {
            if (chess[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }
}
