/**
 * 生命游戏
 * 小于两个活着的邻居的细胞——死
 * 有两个或者三个或者邻居的细胞——活到下一轮
 * 有三个及三个以上或者邻居的细胞——死
 * 有三个活着的邻居的细胞会复活
 * 0 dead -> dead     没有变化
 * 1 live -> live　　   没有变化
 * 2 live -> dead　　从live 变为 dead
 * 3 dead -> live　　从dead 变为live
 */
public class Pro_289 {
    public static void gameOfLife(int[][] board) {
        if (board == null || board.length == 0)
            return;

        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // 记录活着的邻居的个数
                int cnt = 0;
                for (int x = Math.max(0, i - 1); x <= Math.min(m - 1, i + 1); x++) {
                    for (int y = Math.max(0, j - 1); y <= Math.min(n - 1, j + 1); y++) {
                        if (x == i && y == j)
                            continue;
                        if (board[x][y] == 1 || board[x][y] == 2)
                            cnt++;
                    }
                }

                if (board[i][j] == 0 && cnt == 3) {
                    // 状态3表示死而复生
                    board[i][j] = 3;
                } else if (board[i][j] == 1 && (cnt < 2 || cnt > 3)) {
                    // 表示从生到死
                    board[i][j] = 2;
                }
            }
        }

        // 第二轮，转换状态
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = board[i][j] % 2;
            }
        }
    }

    public static void main(String[] args) {
        int[][] board = {
                {0, 1, 0},
                {0, 0, 1},
                {1, 1, 1},
                {0, 0, 0}
        };
        gameOfLife(board);
    }
}
