package dp;

/**
 * 求大连续子数组的和--动态规划
 * <p>
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 */


public class Pro_055 {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            // 如果前面的和小于0，那么重新开始求和
            sum = sum < 0 ? 0 : sum;
            sum += nums[i];
            max = Math.max(sum, max);
        }
        return max;
    }
}
