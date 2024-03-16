package from.ant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pro_1282 {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<List<Integer>>> map = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            if (map.containsKey(groupSizes[i])) {
                List<List<Integer>> groups = map.get(groupSizes[i]);
                if (groups.get(groups.size() - 1).size() < groupSizes[i]) {
                    groups.get(groups.size() - 1).add(i);
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    groups.add(list);
                }
            } else {
                List<List<Integer>> groups = new ArrayList<>();
                List<Integer> list = new ArrayList<>();
                list.add(i);
                groups.add(list);
                map.put(groupSizes[i], groups);
            }
        }

        List<List<Integer>> res = new ArrayList<>();
        for (List<List<Integer>> lists : map.values()) {
            res.addAll(lists);
        }
        return res;
    }
}
