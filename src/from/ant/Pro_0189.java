package from.ant;

public class Pro_0189 {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if (k == 0) {
            return;
        }
        int[] temp = new int[k];
        int index = 0;
        for (int i = nums.length - k; i < nums.length; i++) {
            temp[index++] = nums[i];
        }

        for (int i = nums.length - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }
}
