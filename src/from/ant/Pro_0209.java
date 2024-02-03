package from.ant;

public class Pro_0209 {

    // 耗时2ms
    public int minSubArrayLen1(int target, int[] nums) {
        int sum = nums[0];
        int count = 1;
        int minCount = Integer.MAX_VALUE;

        // 指向当前左值
        int left = 0;
        // 指向当前右值
        int right = 0;
        while (right < nums.length) {

            if (sum == target) {
                minCount = Math.min(minCount, count);
                if (right == nums.length - 1) {
                    break;
                }
                right++;
                sum += nums[right];
                sum -= nums[left];
                left++;
            } else if (sum > target) {
                minCount = Math.min(minCount, count);
                sum -= nums[left];
                left++;
                count--;
            } else {
                if (right == nums.length - 1) {
                    break;
                }
                right++;
                sum += nums[right];
                count++;
            }
        }
        return minCount == Integer.MAX_VALUE ? 0 : minCount;
    }

    // 耗时1ms
    public int minSubArrayLen(int target, int[] nums) {
        int sum = nums[0];
        int count = 1;
        int minCount = Integer.MAX_VALUE;

        // 指向当前左值
        int left = 0;
        // 指向当前右值
        int right = 0;
        while (right < nums.length && left <= right) {

            if (sum >= target) {
                // 只需要移动左指针即可，右指针不需要移动
                minCount = Math.min(minCount, count);
                sum -= nums[left++];
                count--;
            } else {
                right++;
                if (right < nums.length) {
                    sum += nums[right];
                    count++;
                }
            }
        }
        return minCount == Integer.MAX_VALUE ? 0 : minCount;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        System.out.println(new Pro_0209().minSubArrayLen(11, nums));
    }
}
