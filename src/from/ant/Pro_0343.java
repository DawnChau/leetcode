package from.ant;

public class Pro_0343 {
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 1;
        if (n <= 2) {
            return dp[n];
        }

        for (int i = 3; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(Math.max(i - j, dp[i - j]) * j, dp[i]);
            }
        }

        return dp[n];
    }
}
