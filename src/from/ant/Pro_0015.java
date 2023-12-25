package from.ant;

import java.util.*;

/**
 * 求三个数的和等于0
 * 可以参考下2019年写的，这个解法耗时和存储都很高，不是好解法
 * 数组问题还是得优先考虑排序啊！！
 */
public class Pro_0015 {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();

        Map<Integer, Integer> numsMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            numsMap.put(nums[i] * -1, i);
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (numsMap.containsKey(nums[i] + nums[j])) {
                    // 除去自己
                    int index = numsMap.get(nums[i] + nums[j]);
                    if(index == i || index == j){
                        continue;
                    }
                    List<Integer> singleRes = new ArrayList<>(Arrays.asList(nums[i], nums[j], -1 * (nums[i] + nums[j])));
                    Collections.sort(singleRes);
                    res.add(singleRes);
                }
            }
        }
        return new ArrayList<>(res);
    }


    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        System.out.println(new Pro_0015().threeSum(nums).size());
    }
}
