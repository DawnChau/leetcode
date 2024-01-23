package from.ant;

import java.util.Arrays;

public class Pro_2656_Best {

    /**
     * 只需要查找最大值即可，是最优解
     * @param nums
     * @param k
     * @return
     */
    public int maximizeSum(int[] nums, int k) {

        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if(num > max){
                max = num;
            }
        }

        return (max + max + k - 1) * k / 2;
    }

    /**
     * 使用了排序，不是最优解
     * @param nums
     * @param k
     * @return
     */
    public int maximizeSum1(int[] nums, int k) {
        Arrays.sort(nums);
        int num = nums[nums.length - 1];
        return (num + num + k - 1) * k / 2;
    }
}
