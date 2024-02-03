package from.ant;



import java.util.HashMap;
import java.util.Map;

public class Rank_d_0123_3 {
    public long maximumSubarraySum(int[] nums, int k) {
        long[] sum = new long[nums.length];

        long maxResult = Long.MIN_VALUE;


        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                sum[0] = nums[0];
            } else {
                sum[i] = nums[i] + sum[i - 1];
            }

            if (map.containsKey(nums[i])) {
                int index = map.get(nums[i]);
                if (sum[i] - sum[index] < 0) {
                    map.put(nums[i], i);
                }
            } else {
                map.put(nums[i], i);
            }
            if (map.containsKey(nums[i] + k)) {
                int index = map.get(nums[i] + k);
                maxResult = Math.max(sum[i] - sum[index] + nums[index], maxResult);

            }
            if (map.containsKey(nums[i] - k)) {
                int index = map.get(nums[i] - k);
                maxResult = Math.max(sum[i] - sum[index] + nums[index], maxResult);

            }

        }

        if (maxResult == Long.MIN_VALUE) {
            maxResult = 0;
        }
        return maxResult;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,8,9,5};
        System.out.println(new Rank_d_0123_3().maximumSubarraySum(nums, 4));
    }
}
