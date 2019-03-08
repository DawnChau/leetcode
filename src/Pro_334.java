/**
 * 判断是否有递增的三个子序列
 */
public class Pro_334 {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3)
            return false;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > min2)
                return true;
            if (nums[i] < min1)
                min1 = nums[i];
            if (nums[i] < min2 && nums[i] > min1)
                min2 = nums[i];
        }
        return false;
    }
}
