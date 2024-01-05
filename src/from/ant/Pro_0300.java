package from.ant;

public class Pro_0300 {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }

        int[] dp = new int[nums.length];

        int max = Integer.MIN_VALUE;

        dp[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            int maxLength = 0;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    maxLength = Math.max(maxLength, dp[j]);
                }
            }
            dp[i] = maxLength + 1;
            max = Math.max(dp[i], max);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 6, 7, 9, 4, 10, 5, 6};
        System.out.println(new Pro_0300().lengthOfLIS(nums));
    }
}
