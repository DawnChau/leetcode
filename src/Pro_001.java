import java.util.HashMap;
import java.util.Map;

/**
 * map里存这个数，这个数的下标
 * 遍历一遍，如果存在和为target的数在map里，则返回两个索引
 */
public class Pro_001 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        return new int[]{0, 0};
    }
}
