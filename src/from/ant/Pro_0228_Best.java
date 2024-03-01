package from.ant;

import java.util.ArrayList;
import java.util.List;

public class Pro_0228_Best {
    public List<String> summaryRanges(int[] nums) {
        if(nums.length == 0){
            return new ArrayList<>();
        }
        List<String> ans = new ArrayList<>();
        int lastIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[lastIndex] != (i - lastIndex)) {
                ans.add(buildRes(nums, lastIndex, i - 1));
                lastIndex = i;
            }
        }
        ans.add(buildRes(nums, lastIndex, nums.length - 1));
        return ans;
    }

    private String buildRes(int[] nums, int lastIndex, int i) {
        if (lastIndex == i) {
            return String.valueOf(nums[i]);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(nums[lastIndex]));
            sb.append("->");
            sb.append(String.valueOf(nums[i]));
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,4,5,7};
        System.out.println(new Pro_0228_Best().summaryRanges(nums));
    }
}
