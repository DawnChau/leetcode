import java.util.Arrays;

/**
 * 数组的后k个被旋转到前边
 */
public class Pro_189 {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] a = Arrays.copyOfRange(nums, nums.length - k, nums.length);
        for (int i = nums.length - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }
        for (int i = 0; i < k; i++) {
            nums[i] = a[i];
        }
    }
}
