import java.util.HashSet;
import java.util.Set;

/**
 * 判断数独是否合理
 */
public class Pro_036 {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.')
                    continue;
                if (!set.add(board[i][j]))
                    return false;
            }
        }

        for (int i = 0; i < board[0].length; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < board.length; j++) {
                if (board[j][i] == '.')
                    continue;
                if (!set.add(board[j][i]))
                    return false;
            }
        }
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                Set<Character> set = new HashSet<>();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (board[i + row * 3][j + col * 3] == '.')
                            continue;
                        if (!set.add(board[i + row * 3][j + col * 3]))
                            return false;
                    }
                }
            }
        }
        return true;
    }
}
