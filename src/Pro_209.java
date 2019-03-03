/**
 * 求最小长度的子数组和
 */
public class Pro_209 {
    public static int minSubArrayLen(int s, int[] nums) {
        if (nums.length == 0)
            return 0;
        int sum = nums[0];
        int l = 0;
        int res = nums.length + 1;
        for (int i = 0; i < nums.length; ) {
            if (sum < s) {
                if (i == nums.length - 1) {
                    // 全部加起来也不够
                    if (l == 0)
                        return 0;
                    else
                        break;
                }
                sum += nums[++i];
            } else {
                while (sum >= s) {
                    res = Math.min(i - l + 1, res);
                    sum -= nums[l++];
                }
            }
        }
        return res;
    }


}
