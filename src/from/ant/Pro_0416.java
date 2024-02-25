package from.ant;

public class Pro_0416 {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum % 2 != 0) {
            return false;
        }
        int target = sum / 2;
        int dp[] = new int[target + 1];

        // 从第0个数字开始装包
        for (int i = 0; i < nums.length; i++) {
            // 填充背包容量
            for (int j = target; j >= nums[i]; j--) {
                // 装与不装，哪个价值更大
                dp[j] = Math.max(dp[j - nums[i]] + nums[i], dp[j]);
            }
        }
        // 判断背包是否正好装满
        return dp[target] == target;
    }
}
