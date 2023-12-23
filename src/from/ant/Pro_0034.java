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
        myBinarySearch(nums, 0, nums.length - 1, target, res);
        return res;
    }

    private void myBinarySearch(int[] nums, int startIndex, int endIndex, int target, int[] res) {

        // 二分的结束条件
        if (startIndex > endIndex) {
            return;
        }

        if (startIndex == endIndex) {
            if (nums[startIndex] == target) {
                // 设置左值
                if (res[0] == -1) {
                    res[0] = startIndex;
                } else {
                    res[0] = Math.min(res[0], startIndex);
                }

                // 设置右值
                if (res[1] == -1) {
                    res[1] = startIndex;
                } else {
                    res[1] = Math.max(res[1], startIndex);
                }
            }
            return;
        }


        int midIndex = startIndex + (endIndex - startIndex) / 2;

        // 左
        myBinarySearch(nums, startIndex, midIndex, target, res);
        // 右
        myBinarySearch(nums, midIndex + 1, endIndex, target, res);

    }

    public static void main(String[] args) {
        int[] nums = new int[]{5, 7, 7, 8, 8, 10};
        System.out.println(MyUtils.printArray(new Pro_0034().searchRange(nums, 8)));
    }
}
