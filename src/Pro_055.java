
/**
 * 数据能否跳到最后一个位置
 */
public class Pro_055 {
    public boolean canJump(int[] nums) {
        int lastIndex = nums.length-1;
        for(int i = lastIndex-1;i>=0;i--){
            // 如果能够跳到
            if(nums[i]>=lastIndex-i)
                // 最后一个位置等于i
                lastIndex = i;
            // 如果遍历到了最后，发现还是没有元素能跳到
            if(i == 0 && nums[i]<lastIndex-i)
                return false;
        }
        return true;
    }
}
