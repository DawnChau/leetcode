package from.ant;

public class Pro_1641_Best {
    public int countVowelStrings(int n) {
        int[][] dp = new int[n][5];
        for (int i = 0; i < 5; i++) {
            dp[0][i] = 1;
        }
        for (int i = 0; i <= n - 1; i++) {
            dp[i][0] = 1;
        }


        // dp里存储的是以a,e,i,o,u为结尾的字符串的数量
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j < 5; j++) {
                dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
            }
        }

        int count = 0;
        for (int i = 0; i < 5; i++) {
            count += dp[n - 1][i];
        }
        return count;
    }
}
