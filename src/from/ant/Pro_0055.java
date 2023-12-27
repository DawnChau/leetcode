package from.ant;

import java.util.HashMap;
import java.util.Map;

/**
 * 数据能否跳到最后一个位置
 * 并查集的结果很糟糕
 */
public class Pro_0055 {

    public boolean canJump(int[] nums) {

        Map<Integer, Integer> unionMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            unionMap.put(i, i);
        }

        for (int i = 0; i < nums.length; i++) {
            int step = nums[i];
            for (int j = 1; j <= step && i + j < nums.length; j++) {
                unionTwo(unionMap, i, i + j);
                if (i + j == nums.length - 1) {
                    if (isConnect(unionMap, 0, nums.length - 1)) {
                        return true;
                    }
                }
            }
        }
        return isConnect(unionMap, 0, nums.length - 1);
    }

    private boolean isConnect(Map<Integer, Integer> unionMap, int one, int two) {
        int twoUnion = unionMap.get(two);

        int oneUnion = unionMap.get(one);
        // 如果是相同集合，直接返回
        if (oneUnion == twoUnion) {
            return true;
        }
        int temp = oneUnion;
        while (temp != unionMap.get(temp)) {
            temp = unionMap.get(temp);
            if (temp == twoUnion) {
                return true;
            }
        }
        return false;
    }

    private void unionTwo(Map<Integer, Integer> unionMap, int one, int two) {

        unionMap.put(two, unionMap.get(one));
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,1,0,4};
        System.out.println(new Pro_0055().canJump(nums));
    }

}
