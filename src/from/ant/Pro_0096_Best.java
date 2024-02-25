package from.ant;

public class Pro_0096_Best {

    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            // 以j为头节点
            for (int j = 1; j <= i; j++) {
                // dp[j - 1] 左子树的可能性
                // 右子树的可能性
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }
        return dp[n];
    }
}
