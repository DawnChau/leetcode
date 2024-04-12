package from.ant;

import java.util.HashSet;
import java.util.Set;

public class Pro_2367 {
    public int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])
                    && set.contains(nums[i] + diff)
                    && set.contains(nums[i] + 2 * diff)) {
                ans++;
            }
        }
        return ans;
    }
}
