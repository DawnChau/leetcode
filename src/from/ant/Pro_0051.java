package from.ant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pro_0051 {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] chess = new char[n][n];
        // 初始化棋盘
        for (int i = 0; i < n; i++) {
            Arrays.fill(chess[i], '.');
        }
        backTracing(res, chess, 0, n);
        return res;
    }

    private void backTracing(List<List<String>> res, char[][] chess, int row, int n) {
        // 不判断行是因为落子的时候已经控制了每行直落一个

        // 找到一种解法
        if (row == n) {
            List<String> path = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                path.add(new String(chess[i]));
            }
            res.add(path);
            return;
        }

        // 放在哪一列
        for (int i = 0; i < n; i++) {
            if (isValid(chess, row, i)) {
                chess[row][i] = 'Q';
                backTracing(res, chess, row + 1, n);
                chess[row][i] = '.';
            }
        }
    }

    private boolean isValid(char[][] chess, int row, int col) {
        // 竖着不能有Q
        for (int i = 0; i < chess[col].length; i++) {
            if (chess[i][col] == 'Q') {
                return false;
            }
        }

        // 左上不能有Q
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] == 'Q') {
                return false;
            }
        }

        // 右上不能有Q
        for (int i = row - 1, j = col + 1; i >= 0 && j < chess[i].length; i--, j++) {
            if (chess[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Pro_0051().solveNQueens(1));
    }
}
