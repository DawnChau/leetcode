import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角--同118
 */
public class Pro_119 {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < rowIndex + 1; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 1; j < i; j++) {
                List<Integer> lastRow = res.get(i - 1);
                row.add(lastRow.get(j - 1) + lastRow.get(j));
            }
            if (i != 0)
                row.add(1);
            res.add(row);
        }
        return res.get(rowIndex);
    }
}
