package from.ant;

/**
 * 求最大子数组的和
 */
public class Pro_0053 {

    public int maxSubArray(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int num : nums) {
            // 如果前边的和比0小，不要产生副作用，让sum变成0
            sum = sum < 0 ? 0 : sum;
            sum += num;
            maxSum = Integer.max(maxSum, sum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2, -1};
        System.out.println(new Pro_0053().maxSubArray(nums));
    }
}
