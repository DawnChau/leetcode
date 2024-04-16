package from.ant;

public class Pro_2221 {
    public int triangularSum(int[] nums) {
        int length = nums.length;
        while (length > 1) {
            for (int i = 1; i < length; i++) {
                nums[i - 1] = (nums[i - 1] + nums[i]) % 10;
            }
            length--;
        }
        return nums[0];
    }
}
