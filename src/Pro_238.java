/**
 * 除自己之外的全部的乘积
 * 左右数组
 */
public class Pro_238 {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] res = new int[nums.length];

        left[0] = 1;
        right[nums.length - 1] = 1;

        for (int i = 1; i < nums.length; i++)
            left[i] = nums[i - 1] * left[i - 1];

        for (int i = 0; i < nums.length - 1; i++)
            right[nums.length - 2 - i] = right[nums.length - 1 - i] * nums[nums.length - 1 - i];

        for (int i = 0; i < nums.length; i++)
            res[i] = left[i] * right[i];
        return res;

    }
}
