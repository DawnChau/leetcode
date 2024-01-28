package from.ant;

public class Pro_0033_Best {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }

            // 左边是有序的， nums[left] == nums[mid] 也应该归属到左边有序中
            if (nums[left] <= nums[mid]) {
                // 在左边
                if (target >= nums[left] && target <= nums[mid]) {
                    right = mid - 1;
                } else {
                    // 否则不在有序区间里
                    left = mid + 1;
                }
            } else {
                // 右边是有序的
                if (target >= nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    // 否则不在有序区间里
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,1};
        System.out.println(new Pro_0033_Best().search(nums,1));
    }
}
