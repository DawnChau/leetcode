package from.ant;

import java.util.ArrayList;
import java.util.List;

public class Pro_1313 {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < nums.length; i+=2) {
            for (int j = 0; j < nums[i-1]; j++) {
                list.add(nums[i]);
            }
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}
