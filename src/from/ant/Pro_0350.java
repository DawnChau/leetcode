package from.ant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pro_0350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = init(nums1);
        Map<Integer, Integer> map2 = init(nums2);
        List<Integer> list = new ArrayList<>();
        for (Integer integer : map1.keySet()) {
            if(map2.containsKey(integer)){
                int times = Math.min(map1.get(integer), map2.get(integer));
                for (int i = 0; i < times ; i++) {
                    list.add(integer);
                }
            }
        }
        int[] res = new int[list.size()];
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            res[index++] = list.get(i);
        }
        return res;
    }

    private Map<Integer, Integer> init(int[] nums1) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i])) {
                int times = map.get(nums1[i]);
                map.put(nums1[i], times + 1);
            } else {
                map.put(nums1[i], 1);
            }
        }
        return map;
    }
}
