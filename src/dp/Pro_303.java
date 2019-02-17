package dp;

/**
 * 数组范围求和--动态规划
 * Given nums = [-2, 0, 3, -5, 2, -1]
 * sumRange(0, 2) -> 1
 * sumRange(2, 5) -> -1
 * sumRange(0, 5) -> -3
 */
public class Pro_303 {
    private int[] dp;

    public Pro_303(int[] nums) {
        dp = new int[nums.length];
        if (nums.length != 0) {
            dp[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                dp[i] = dp[i - 1] + nums[i];
            }
        }

    }

    public int sumRange(int i, int j) {
        if (dp.length == 0)
            return 0;
        if (i == 0)
            return dp[j];
        else
            return dp[j] - dp[i - 1];
    }
}
