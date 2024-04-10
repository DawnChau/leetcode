package from.ant;

public class Pro_1863_Best {

    private int sum = 0;
    private int xorRes = 0;

    public int subsetXORSum(int[] nums) {
        int xorRes = 0;
        backTracing(nums, 0);
        return sum;
    }

    private void backTracing(int[] nums, int startIndex) {

        sum += xorRes;

        for (int i = startIndex; i < nums.length; i++) {
            xorRes ^= nums[i];
            backTracing(nums, i + 1);
            xorRes ^= nums[i];
        }
    }

}
