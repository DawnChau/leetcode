/**
 * 二维平面上查找单词，回溯
 */
public class Pro_079 {

    private int m;
    private int n;
    private int[][] d = {
            {0, 1},
            {0, -1},
            {1, 0},
            {-1, 0}
    };
    private boolean[][] visited;

    public boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;

        visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (searchWord(board, word, 0, i, j))
                    return true;
            }
        }
        return false;

    }

    private boolean searchWord(char[][] board, String word, int index, int startX, int startY) {
        if (index == word.length() - 1)
            return board[startX][startY] == word.charAt(index);

        if (board[startX][startY] == word.charAt(index)) {
            visited[startX][startY] = true;
            for (int i = 0; i < 4; i++) {
                int newX = startX + d[i][0];
                int newY = startY + d[i][1];
                if (inArea(newX, newY) && !visited[newX][newY]) {
                    if (searchWord(board, word, index + 1, newX, newY))
                        return true;
                }
            }
            // 回溯
            visited[startX][startY] = false;
        }
        return false;
    }

    private boolean inArea(int newX, int newY) {
        return newX >= 0 && newX < m && newY >= 0 && newY < n;
    }
}
