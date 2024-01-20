package from.ant;

import java.util.HashMap;
import java.util.Map;

public class Pro_0169 {
    public int majorityElement(int[] nums) {
        int count = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int times = 1;
            if (map.containsKey(num)) {
                times = map.get(num);
                times++;
                if (times > count) {
                    return num;
                }
                map.put(num, times);
            } else {
                if (times > count) {
                    return num;
                }
                map.put(num, times);
            }
        }
        return -1;
    }
}
