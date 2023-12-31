package from.ant;

public class Pro_0198_Best {
    public int rob(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }

        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        int[] res = new int[nums.length];

        res[nums.length - 1] = nums[nums.length - 1];
        res[nums.length - 2] = Math.max(nums[nums.length - 1], nums[nums.length - 2]);

        for (int i = nums.length - 3; i >= 0; i--) {
            // 加上隔一个的最大值
            res[i] = nums[i] + findMax(res, i + 2);
        }

        return Math.max(res[0], res[1]);
    }

    private int findMax(int[] res, int i) {
        int max = res[i];
        for (int j = i; j < res.length; j++) {
            max = Math.max(res[j], max);
        }
        return max;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{4, 1, 2, 7, 5, 3, 1};
        System.out.println(new Pro_0198_Best().rob(nums));
    }
}
