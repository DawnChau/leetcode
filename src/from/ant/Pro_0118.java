package from.ant;

import java.util.ArrayList;
import java.util.List;

public class Pro_0118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            if (i == 0) {
                row.add(1);
            } else {
                row.add(1);
                List<Integer> preRow = ans.get(i - 1);
                for (int j = 1; j < preRow.size(); j++) {
                    row.add(preRow.get(j) + preRow.get(j - 1));
                }
                row.add(1);
            }
            ans.add(row);
        }
        return ans;
    }
}
