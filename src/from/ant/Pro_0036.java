package from.ant;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pro_0036 {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            // 检查行
            if (!check(convertRow(board[i]))) {
                return false;
            }
            // 检查列
            if (!check(convertCol(board, i))) {
                return false;
            }
        }

        for (int i = 0; i < board.length; i += 3) {
            for (int j = 0; j < board.length; j += 3) {
                if (!check(convertMatrix(i, j, board))) {
                    return false;
                }
            }
        }
        return true;
    }

    private List<Character> convertMatrix(int i, int j, char[][] board) {
        List<Character> characters = new ArrayList<>();
        for (int row = i; row < i + 3; row++) {
            for (int col = j; col < j + 3; col++) {
                characters.add(board[row][col]);
            }
        }
        return characters;
    }

    private List<Character> convertCol(char[][] board, int i) {
        List<Character> characters = new ArrayList<>();
        for (int j = 0; j < board.length; j++) {
            characters.add(board[j][i]);
        }
        return characters;
    }

    private List<Character> convertRow(char[] chars) {
        List<Character> characters = new ArrayList<>();
        for (char aChar : chars) {
            characters.add(aChar);
        }
        return characters;
    }

    private boolean check(List<Character> chars) {
        Set<Character> integers = new HashSet<>();
        for (int i = 0; i < chars.size(); i++) {
            if (chars.get(i) == '.') {
                continue;
            }

            if (integers.contains(chars.get(i))) {
                return false;
            }

            integers.add(chars.get(i));
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = new char[][] {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.println(new Pro_0036().isValidSudoku(board));
    }
}
