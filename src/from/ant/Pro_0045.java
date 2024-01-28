package from.ant;

import java.util.Arrays;

public class Pro_0045 {
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i]; j++) {
                if (i + j + 1 < nums.length) {
                    dp[i + j + 1] = Math.min(dp[i] + 1, dp[i + j + 1]);
                }
            }
        }
        return dp[nums.length - 1];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,3,0,1,4};
        System.out.println(new Pro_0045().jump(nums));
    }
}
