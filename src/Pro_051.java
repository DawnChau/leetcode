import java.util.ArrayList;
import java.util.List;

/**
 * N 皇后问题
 */
public class Pro_051 {

    private List<List<String>> res = new ArrayList<>();
    private boolean[] col;
    private boolean[] dia1;
    private boolean[] dia2;

    public List<List<String>> solveNQueens(int n) {
        ArrayList<Integer> row = new ArrayList<>();
        col = new boolean[n];
        dia1 = new boolean[2 * n - 1];
        dia2 = new boolean[2 * n - 1];

        // index 是 行
        putQueen(n, 0, row);
        return res;
    }

    private void putQueen(int n, int index, List<Integer> row) {
        // 成功找到了一种
        if (index == n) {
            res.add(generateBoard(n, row));
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!col[i] && !dia1[index + i] && !dia2[index - i + n - 1]) {
                row.add(i);
                col[i] = true;
                dia1[index + i] = true;
                dia2[index - i + n - 1] = true;
                putQueen(n, index + 1, row);
                col[i] = false;
                dia1[index + i] = false;
                dia2[index - i + n - 1] = false;
                row.remove((Integer) i);
            }
        }
        return;
    }

    private List<String> generateBoard(int n, List<Integer> row) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (row.get(i) == j)
                    sb.append('Q');
                else
                    sb.append('.');
            }

            list.add(sb.toString());
        }
        return list;
    }

    public static void main(String[] args) {
        new Pro_051().solveNQueens(4);
    }
}
