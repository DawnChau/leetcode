package from.ant;

/**
 * 求和公式，减去每个元素
 */
public class MianShi_1704_Best {

    public int missingNumber(int[] nums) {

        int count = nums.length + 1;
        int sum = (count * nums.length) / 2;

        for (int i = 0; i < nums.length; i++) {
            sum -= nums[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(new MianShi_1704_Best().missingNumber(nums));
    }
}
