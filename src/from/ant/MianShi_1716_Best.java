package from.ant;

import java.util.HashMap;
import java.util.Map;

/**
 * 按摩师不能连续服务两个人
 * 求不相连数组的最大值。
 * 分治+缓存优化中间结果
 */
public class MianShi_1716_Best {

    public int massage(int[] nums) {
        Map<Integer, Integer> cache = new HashMap<>();
        return subMassage(nums, 0, cache);
    }

    private int subMassage(int[] nums, int index, Map<Integer, Integer> cache) {

        if (cache.containsKey(index)) {
            return cache.get(index);
        }

        int result = 0;

        if (index > nums.length - 1) {
            result = 0;
            cache.put(index, result);
            return result;
        }

        if (index == nums.length - 1) {
            result = nums[index];
            cache.put(index, result);
            return result;
        }

        if (index == nums.length - 2) {
            result = Math.max(nums[index], nums[index + 1]);
            cache.put(index, result);
            return result;
        }


        result = Math.max(
                nums[index] + subMassage(nums, index + 2, cache),
                nums[index + 1] + subMassage(nums, index + 3, cache));
        cache.put(index, result);
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 1, 4, 5, 3, 1, 1, 3};
        System.out.println(new MianShi_1716_Best().massage(nums));
    }
}
