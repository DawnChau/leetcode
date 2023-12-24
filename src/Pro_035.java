/**
 * 寻找插入位置--数组
 * Input: [1,3,5,6], 5
 * Output: 2
 *
 * 2023年12月24日13:44:04 评论：
 * 这个实现有问题，不是O(logN)的复杂度
 */
public class Pro_035 {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0)
            return 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == target)
                return i;
            if (nums[i] < target && nums[i + 1] > target)
                return i + 1;
            if (nums[0] > target)
                return 0;
        }
        if (nums[nums.length - 1] < target)
            return nums.length;
        else
            return nums.length - 1;
    }
}
