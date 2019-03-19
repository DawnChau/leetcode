/**
 * 将一个数break，求乘积最大
 */
public class Pro_343 {
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                // 三个数中求最大值 j * (i - j) 分成两份   j * dp[i - j])   分成多份
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), j * dp[i - j]));
            }
        }
        return dp[n];
    }
}
