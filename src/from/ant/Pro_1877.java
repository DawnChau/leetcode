package from.ant;

import java.util.Arrays;

public class Pro_1877 {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        int left = 0;
        int right = nums.length-1;
        while (left < right){
            max = Math.max(max, nums[left]+ nums[right]);
            left++;
            right--;
        }
        return max;
    }
}
