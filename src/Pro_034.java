/**
 * 二分查找一个范围
 */
public class Pro_034 {
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return new int[]{-1, -1};
        int left = 0;
        int right = nums.length - 1;
        // 这里注意相等也可以，因为可能只有一个元素
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid])
                return getRange(nums, mid);
            else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    private int[] getRange(int[] nums, int mid) {
        int left = mid;
        int right = mid;
        int target = nums[mid];
        while (left >= 0 && nums[left] == target)
            left--;
        while (right < nums.length && nums[right] == target)
            right++;
        return new int[]{++left, --right};
    }
}
