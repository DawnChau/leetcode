/**
 * 寻找第k大的元素，快速排序
 */
public class Pro_215 {
    public int findKthLargest(int[] nums, int k) {
        int left = 0;
        int right = nums.length - 1;
        while (true) {
            int p = partition(nums, left, right);
            if (p == k - 1)
                return nums[p];
            if (p > k - 1)
                // 在左边
                right = p - 1;
            else
                // 在右边
                left = p + 1;
        }
    }

    // 左侧的大，右侧的小
    public int partition(int[] array, int low, int high) {
        int key = array[low];
        while (low < high) {
            while (array[high] <= key && high > low)
                high--;
            array[low] = array[high];
            while (array[low] >= key && high > low)
                low++;
            array[high] = array[low];
        }
        array[high] = key;
        return high;
    }
}
