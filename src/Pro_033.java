/**
 * 旋转后数组的二分查找法--（难啊）
 */
public class Pro_033 {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;


        while (left <= right) {
            int mid = left + (right - left) / 2;


            if (left == right && nums[left] != target)
                break;
            // 忽略下文中的等号判断
            if (nums[mid] == target)
                return mid;
            if (nums[right] == target)
                return right;
            if (nums[left] == target)
                return left;

            // 先判断哪个区是增序的
            if (nums[mid] > nums[left]) {
                // 左半区是增序的
                if (target > nums[mid]) {
                    // 属于右半区
                    left = mid + 1;
                } else {
                    if (target < nums[left]) {
                        // 属于右半区
                        left = mid + 1;
                    } else {
                        // 属于左半区
                        right = mid - 1;
                    }
                }
            } else {
                // 左半区不是递增的
                if (target < nums[mid]) {
                    // 属于左半区
                    right = mid - 1;
                } else {
                    if (target > nums[right]) {
                        // 属于左半区
                        right = mid - 1;
                    } else {
                        // 属于右半区
                        left = mid + 1;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {3, 1};
        System.out.println(search(a, 0));
    }
}
