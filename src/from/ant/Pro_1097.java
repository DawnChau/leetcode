package from.ant;

import java.util.HashSet;
import java.util.Set;

public class Pro_1097 {
    public int numTilePossibilities(String tiles) {
        Set<String> ans = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        backTracing(tiles.toCharArray(), ans, sb, 0);
        return ans.size() - 1;
    }

    private void backTracing(char[] tiles, Set<String> ans, StringBuilder sb, int startIndex) {
        ans.add(sb.toString());

        // 为第startIndex个位置进行选择
        for (int i = startIndex; i < tiles.length; i++) {
            mySwap(tiles, i, startIndex);
            sb.append(tiles[startIndex]);
            backTracing(tiles, ans, sb, startIndex + 1);
            sb.replace(sb.length() - 1, sb.length(), "");
            mySwap(tiles, i, startIndex);
        }
    }

    private void mySwap(char[] tiles, int i, int startIndex) {
        if (i == startIndex) {
            return;
        }
        char temp = tiles[i];
        tiles[i] = tiles[startIndex];
        tiles[startIndex] = temp;
    }
}
