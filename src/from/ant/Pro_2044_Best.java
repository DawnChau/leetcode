package from.ant;

public class Pro_2044_Best {

    private int res = 0;

    public int countMaxOrSubsets(int[] nums) {
        int orRes = 0;
        for (int i = 0; i < nums.length; i++) {
            orRes |= nums[i];
        }
        int orMax = 0;
        backTracing(nums, 0, orMax, orRes);
        return res;
    }

    private void backTracing(int[] nums, int startIndex, int orMax, int orRes) {

        for (int i = startIndex; i < nums.length; i++) {
            // 剪枝，已经等于最大值了就返回
            int temp = orMax | nums[i];
            if (temp == orRes) {
                res += (1 << nums.length - i - 1);
                continue;
            }

            backTracing(nums, i + 1, temp, orRes);
        }
    }


}
