/**
 * 找出那个只出现了一次的数据--异或
 */
public class Pro_136 {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans ^= nums[i];
        }
        return ans;
    }
}
