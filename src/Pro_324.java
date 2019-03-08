import java.util.Arrays;

/**
 * 摇摆排序
 */
public class Pro_324 {
    public void wiggleSort(int[] nums) {
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        int mid = (nums.length - 1) / 2;
        for (int i = 0, j = mid, k = nums.length - 1; i < nums.length; i += 2, j--, k--) {
            // 将前半段倒序填入奇数下标
            nums[i] = sorted[j];
            // 将后半段倒序填入偶数下标
            if (i + 1 < nums.length)
                nums[i + 1] = sorted[k];
        }
    }
}
