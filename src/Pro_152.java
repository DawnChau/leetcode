/**
 * 最大乘积子数组
 */
public class Pro_152 {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int maxNum = nums[0];
        int minNum = nums[0];
        int res = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int t1 = maxNum * nums[i];
            int t2 = minNum * nums[i];
            maxNum = Math.max(Math.max(t1, t2), nums[i]);
            minNum = Math.min(Math.min(t1, t2), nums[i]);
            res = Math.max(res, maxNum);
        }
        return res;
    }
}
