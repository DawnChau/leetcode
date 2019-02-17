package dp;

/**
 * 最小代价爬楼梯--动态规划
 * Input: cost = [10, 15, 20]
 * Output: 15
 * Explanation: Cheapest is start on cost[1], pay that cost and go to the top.
 *
 *
 * 我自己做的
 * dp[i] 指的是一定走i，所以要加上cost[i]
 */
public class Pro_746 {
    public int minCostClimbingStairs(int[] cost) {
        if (cost.length == 0)
            return 0;
        if (cost.length == 1)
            return cost[0];
        if (cost.length == 2)
            return Math.min(cost[0], cost[1]);
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = Math.min(cost[0], cost[1]);
        for (int i = 2; i < cost.length; i++) {
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
        }
        return Math.min(dp[cost.length - 1], dp[cost.length - 2]);
    }
}
