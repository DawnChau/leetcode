import java.util.Arrays;

/**
 * 求最长递增子序列
 */
public class Pro_300 {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0)
            return 0;

        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i])
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
            }
        }

        int res = 1;
        for (int i = 0; i < nums.length; i++) {
            if (dp[i] > res)
                res = dp[i];
        }
        return res;
    }
}
