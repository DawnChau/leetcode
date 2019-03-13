/**
 * 寻找峰值
 */
public class Pro_162 {
    public int findPeakElement(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int m = l + (r - l) / 2;
            // 右边是递增区间且m一定不是峰
            if (nums[m] < nums[m + 1])
                l = m + 1;
            else
                // m可能是峰
                r = m;
        }
        return l;
    }
}
