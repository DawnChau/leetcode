package from.ant;

import java.util.Arrays;

public class Pro_2160_Best {
    public int minimumSum(int num) {
        int[] nums = splitNum(num);
        Arrays.sort(nums);
        return nums[0] * 10 + nums[3] + nums[1] * 10 + nums[3];
    }

    private int[] splitNum(int num) {
        int[] res = new int[4];
        int index = 0;
        while (index < 4) {
            res[index++] = num % 10;
            num /= 10;
        }
        return res;
    }
}
