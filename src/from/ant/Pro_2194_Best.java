package from.ant;

import java.util.ArrayList;
import java.util.List;

public class Pro_2194_Best {

    public List<String> cellsInRange(String s) {
        List<String> ans = new ArrayList<>();
        char startCol = s.charAt(0);
        char endCol = s.charAt(3);
        char startRow = s.charAt(1);
        char endRow = s.charAt(4);
        for (char i = startCol; i <= endCol; i++) {
            for (char j = startRow; j <=endRow ; j++) {
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append(j);
                ans.add(sb.toString());
            }
        }
        return ans;
    }
}
