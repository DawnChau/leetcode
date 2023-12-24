package from.ant;

/**
 * 二分查找，比典型的二分查找稍微复杂点，如果没找到不能返回-1，需要插入
 */
public class Pro_0035 {
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        return myBinarySearch(nums, target, 0, nums.length - 1);
    }

    private int myBinarySearch(int[] nums, int target, int startIndex, int endIndex) {

        // 处理结束
        if (startIndex >= endIndex) {
            if (nums[endIndex] >= target) {
                return endIndex;
            } else {
                return endIndex + 1;
            }

        }

        int midIndex = startIndex + (endIndex - startIndex) / 2;

        if (nums[midIndex] == target) {
            return midIndex;
        }

        // 寻找右边
        if (target > nums[midIndex]) {
            return myBinarySearch(nums, target, midIndex + 1, endIndex);
        } else {
            return myBinarySearch(nums, target, startIndex, midIndex);
        }

    }

    public static void main(String[] args) {
        int nums[] = new int[]{1, 3, 5, 6};
        System.out.println(new Pro_0035().searchInsert(nums, 2));
    }
}
