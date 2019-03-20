/**
 * 本质是背包问题
 */
public class Pro_416 {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum % 2 != 0)
            return false;

        // 物品的个数
        int n = nums.length;
        // 容量
        int C = sum / 2;

        boolean[] dp = new boolean[C + 1];
        // 容量为i的时候，可以放下第一个物体
        for (int i = 1; i <= C; i++) {
            dp[i] = (nums[0] == i);
        }

        for (int i = 1; i < n; i++) {
            // 容量j一定不能比第i个物体的重量小
            for (int j = C; j >= nums[i]; j--) {
                // 若是dp[j-nums[i]] 是 true，dp[j]也是true
                dp[j] = dp[j] || dp[j - nums[i]];
            }
        }
        return dp[C];
    }

    public static void main(String[] args) {
        int[] a = {1, 1};
        new Pro_416().canPartition(a);
    }
}
