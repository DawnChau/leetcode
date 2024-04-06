package from.ant;

public class Pro_2574 {
    public int[] leftRightDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];

        int leftSumNum = 0;
        int rightSumNum = 0;

        for (int i = 0; i < nums.length; i++) {
            leftSum[i] = leftSumNum;
            leftSumNum += nums[i];

            rightSum[nums.length - 1 - i] = rightSumNum;
            rightSumNum += nums[nums.length - 1 - i];
        }

        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return ans;
    }
}
