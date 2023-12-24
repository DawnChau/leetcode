package from.ant;

/**
 * 在排序数组中查找元素的第一个和最后一个位置
 * 注意二分的结束条件和mid的判断，用a + (b-a)/2 不是 (a + (b-a))/2
 */
public class Pro_0034 {

    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[]{-1, -1};
        // 处理空数组
        if (nums.length == 0) {
            return res;
        }
        int resIndex = myBinarySearch(nums, 0, nums.length - 1, target);
        if (resIndex == -1) {
            return res;
        }
        return extendSpan(nums, resIndex, res);
    }

    private int[] extendSpan(int[] nums, int resIndex, int[] res) {
        int leftIndex = resIndex;
        int rightIndex = resIndex;
        while (leftIndex >= 0 && nums[leftIndex] == nums[resIndex]) {
            res[0] = leftIndex;
            leftIndex--;
        }

        while (rightIndex < nums.length && nums[rightIndex] == nums[resIndex]) {
            res[1] = rightIndex;
            rightIndex++;
        }

        return res;
    }

    private int myBinarySearch(int[] nums, int startIndex, int endIndex, int target) {

        // 二分的结束条件
        if (startIndex >= endIndex) {
            if (nums[endIndex] == target) {
                return endIndex;
            } else {
                return -1;
            }
        }

        int midIndex = startIndex + (endIndex - startIndex) / 2;

        if (nums[midIndex] == target) {
            return midIndex;
        }

        if (nums[midIndex] > target) {
            return myBinarySearch(nums, startIndex, midIndex, target);
        } else {
            return myBinarySearch(nums, midIndex + 1, endIndex, target);
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1};
        System.out.println(MyUtils.printArray(new Pro_0034().searchRange(nums, 1)));
    }
}
