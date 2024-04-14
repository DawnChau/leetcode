package from.ant;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Pro_1817 {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int[] ans = new int[k];
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int i = 0; i < logs.length; i++) {
            map.computeIfAbsent(logs[i][0], a -> new HashSet<>()).add(logs[i][1]);
        }

        for (Map.Entry<Integer, Set<Integer>> entry : map.entrySet()) {
            ans[entry.getValue().size()-1]++;
        }
        return ans;
    }
}
