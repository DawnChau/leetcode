package from.ant;

import java.util.ArrayList;
import java.util.List;

public class Pro_2149 {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];

        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                positive.add(nums[i]);
            } else {
                negative.add(nums[i]);
            }
        }

        for (int i = 0; i < ans.length; i++) {
            if (i % 2 == 0) {
                ans[i] = positive.get(i / 2);
            } else {
                ans[i] = negative.get(i / 2);
            }
        }
        return ans;
    }
}
