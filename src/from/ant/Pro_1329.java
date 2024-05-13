package from.ant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pro_1329 {
    public int[][] diagonalSort(int[][] mat) {
        int[][] res = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat[0].length; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int row = 0, col = i; row < mat.length && col < mat[0].length; row++, col++) {
                temp.add(mat[row][col]);
            }
            Collections.sort(temp);
            int index = 0;
            for (int row = 0, col = i; row < mat.length && col < mat[0].length; row++, col++) {
                res[row][col] = temp.get(index++);
            }
        }

        for (int j = 1; j < mat.length; j++) {
            List<Integer> temp = new ArrayList<>();
            for (int row = j, col = 0; row < mat.length && col < mat[0].length; row++, col++) {
                temp.add(mat[row][col]);
            }
            Collections.sort(temp);
            int index = 0;
            for (int row = j, col = 0; row < mat.length && col < mat[0].length; row++, col++) {
                res[row][col] = temp.get(index++);
            }
        }
        return res;
    }
}
