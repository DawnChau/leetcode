package from.ant;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Pro_0073 {
    public void setZeroes(int[][] matrix) {
        Set<Integer> zeroRows = new HashSet<>();
        Set<Integer> zeroCols = new HashSet<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows.add(i);
                    zeroCols.add(j);
                }
            }
        }

        for (Integer zeroRow : zeroRows) {
            Arrays.fill(matrix[zeroRow], 0);
        }

        for (Integer zeroCol : zeroCols) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][zeroCol] = 0;
            }
        }
    }
}
