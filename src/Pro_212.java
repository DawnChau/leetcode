import java.util.ArrayList;
import java.util.List;

/**
 * 平面上查找单词是否出现
 */
public class Pro_212 {

    private int m;
    private int n;
    private int[][] d = {
            {0, 1},
            {0, -1},
            {1, 0},
            {-1, 0}
    };
    private boolean[][] visited;

    private boolean searchWord(char[][] board, String word, int index, int startX, int startY) {
        if (index == word.length() - 1)
            return board[startX][startY] == word.charAt(index);

        if (board[startX][startY] == word.charAt(index)) {
            visited[startX][startY] = true;
            // 分四个方向查找下一个字母是否存储
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

    public List<String> findWords(char[][] board, String[] words) {
        m = board.length;
        n = board[0].length;

        List<String> res = new ArrayList<>();

        for (int x = 0; x < words.length; x++) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    visited = new boolean[m][n];
                    if (searchWord(board, words[x], 0, i, j)) {
                        if (!res.contains(words[x]))
                            res.add(words[x]);
                    }

                }
            }
        }

        return res;
    }
}
