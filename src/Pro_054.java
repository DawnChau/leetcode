import java.util.ArrayList;
import java.util.List;

/**
 * 螺旋输出矩阵
 */
public class Pro_054 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix.length == 0 || matrix[0].length == 0) {
            return res;
        }
        int left = 0;
        int right = matrix[0].length - 1;
        int up = 0;
        int down = matrix.length - 1;
        while (left <= right && up <= down) {
            for (int i = left; i <= right && up <= down; i++) {
                res.add(matrix[up][i]);
            }
            up++;
            for (int i = up; i <= down && left <= right; i++) {
                res.add(matrix[i][right]);
            }
            right--;
            for (int i = right; i >= left && up <= down; i--) {
                res.add(matrix[down][i]);
            }
            down--;
            for (int i = down; i >= up && left <= right; i--) {
                res.add(matrix[i][left]);
            }
            left++;
        }
        return res;
    }
}
