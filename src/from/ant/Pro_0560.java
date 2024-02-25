package from.ant;

public class Pro_0560 {
    public int subarraySum(int[] nums, int k) {
        int[] dp = new int[k + 1];

        dp[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = k; j >= nums[i]; j--) {
                // dp[j] 表示填满空间为j的背包有几种方法
                dp[j] += dp[j - nums[i]];
            }
        }
        return dp[k];
    }
}
