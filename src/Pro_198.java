/**
 * 不能连着偷相邻的两个房间--动态规划
 * Input: [1,2,3,1]
 * Output: 4
 * Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
 * Total amount you can rob = 1 + 3 = 4.
 */
public class Pro_198 {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length+1];
        if(nums.length==0)
            return 0;

        if(nums.length==1){
            return nums[0];
        }

        if(nums.length==2){
            return Math.max(nums[1],nums[0]);
        }

        dp[1] = nums[0];
        dp[2] = Math.max(nums[1],nums[0]);
        for(int i = 3;i<=nums.length;i++){
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i-1]);
        }
        return dp[nums.length];
    }

}
