/**
 * 旋转后数组的二分查找法
 */
public class Pro_033 {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;


        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target)
                return mid;
            else if (target > nums[right] || target < nums[mid]) {
                // 如果target比最右边的数还大，那么证明在左边里继续找
                right = mid - 1;
            } else if (target < nums[left] || target > nums[mid]) {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(a, 0));
    }
}
