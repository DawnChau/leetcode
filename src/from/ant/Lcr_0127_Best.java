package from.ant;

public class Lcr_0127_Best {
    public int trainWays(int num) {
        if (num <= 2) {
            return num;
        }
        int[] dp = new int[num + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 0; i <= num; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;
        }
        return dp[num];
    }
}
