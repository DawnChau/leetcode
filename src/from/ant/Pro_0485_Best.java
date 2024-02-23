package from.ant;

public class Pro_0485_Best {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; ) {
            if (nums[i] == 0) {
                i++;
                continue;
            } else {
                int count = 0;
                while (i < nums.length && nums[i] == 1) {
                    count++;
                    i++;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }
}
