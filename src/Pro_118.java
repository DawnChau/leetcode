import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角--数组
 * Input: 5
 * Output:
 * [
 * [1],
 * [1,1],
 * [1,2,1],
 * [1,3,3,1],[1,4,6,4,1]
 * ]
 */
public class Pro_118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
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
        return res;
    }
}
