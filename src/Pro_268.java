/**
 * 寻找丢失的数
 */
public class Pro_268 {
    public int missingNumber(int[] nums) {
        int res = nums.length;

        // i丢失的是最大的，所以i-nums[i]是非正数
        for(int i = 0;i<nums.length;i++){
            res+=(i-nums[i]);
        }
        return res;
    }
}
