/**
 * O(1)的移除固定元素，输出最后剩余几个--数组
 * Given nums = [3,2,2,3], val = 3,
 * Your function should return length = 2, with the first two elements of nums being 2.
 * It doesn't matter what you leave beyond the returned length.
 */
public class Pro_027 {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0)
            return 0;
        int res = 0;
        for (int i = 0; i < nums.length - res; i++) {
            if (nums[i] == val) {
                // 换到后边
                res++;
                nums[i] = nums[nums.length - res];
                i--;
            }
        }
        return nums.length - res;
    }
}
