import java.util.Arrays;

/**
 * 最少的零钱凑够规定目标
 * dp[m] 表示凑够m元钱需要的最少的硬币数量
 */
public class Pro_322 {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        // 尝试所有的硬币可能
        for (int i = 0; i < coins.length; i++) {
            for (int j = 0; j <= amount; j++) {
                // 需要凑齐的amout 是 j，并且j选择coin[i]
                int pre = j - coins[i];
                if (pre >= 0 && dp[pre] < Integer.MAX_VALUE) {
                    // 看看选择coin[i] 能否如昂dp[j]更小
                    dp[j] = Math.min(dp[pre] + 1, dp[j]);
                }
            }
        }
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }
}
