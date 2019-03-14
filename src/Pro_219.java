import java.util.HashSet;

/**
 * 滑动窗口+查找表
 */
public class Pro_219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i]))
                return true;
            set.add(nums[i]);

            // 最多有k个元素
            if (set.size() == k + 1)
                set.remove(nums[i - k]);
        }
        return false;
    }
}
