package from.ant;

import java.util.ArrayList;
import java.util.List;

public class Pro_0054_Best {
    public List<Integer> spiralOrder(int[][] matrix) {
        int count = matrix.length * matrix[0].length;
        int[][] direct = new int[][]{
                {0, 1},
                {1, 0},
                {0, -1},
                {-1, 0}
        };
        List<Integer> ans = new ArrayList<>();

        int x = 0;
        int y = 0;
        int direction = 0;
        for (int i = 1; i <= count; i++) {
            ans.add(matrix[x][y]);
            // 已经读取过的数字设置为最小值
            matrix[x][y] = Integer.MIN_VALUE;
            int dx = x + direct[direction % 4][0];
            int dy = y + direct[direction % 4][1];
            // 需要转向
            if (dx < 0 || dx >= matrix.length || dy < 0 || dy >= matrix[0].length || matrix[dx][dy] == Integer.MIN_VALUE) {
                direction++;
                dx = x + direct[direction % 4][0];
                dy = y + direct[direction % 4][1];
            }
            x = dx;
            y = dy;
        }
        return ans;
    }
}
