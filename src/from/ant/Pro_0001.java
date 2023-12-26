package from.ant;

import java.util.HashMap;
import java.util.Map;

/**
 * map里存这个数，这个数的下标
 * 遍历一遍，如果存在和为target的数在map里，则返回两个索引
 */
public class Pro_0001 {

    public int[] twoSum(int[] nums, int target) {

        int[] res = new int[2];
        Map<Integer, Integer> data = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int another = target - nums[i];
            if (data.containsKey(another)) {
                res[0] = i;
                res[1] = data.get(another);
                return res;
            }
            data.put(nums[i], i);
        }

        return res;
    }


    public static void main(String[] args) {
        int[] num = new int[]{3, 3};
        System.out.println(MyUtils.printArray(new Pro_0001().twoSum(num, 6)));
    }
}
