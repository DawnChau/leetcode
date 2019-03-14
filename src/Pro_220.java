import java.util.TreeSet;

/**
 * 滑动窗口+有序set
 */
public class Pro_220 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.ceiling((long) nums[i] - (long) t) != null && set.ceiling((long) nums[i] - (long) t) <= (long) nums[i] + (long) t)
                return true;
            set.add((long) nums[i]);
            if (set.size() == k + 1)
                set.remove((long) nums[i - k]);
        }
        return false;
    }
}
