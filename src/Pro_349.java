import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 查找表——set
 */
public class Pro_349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> res = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i]))
                res.add(nums2[i]);
        }

        int[] ans = new int[res.size()];
        Iterator<Integer> it = res.iterator();
        int index = 0;
        while (it.hasNext()) {
            ans[index++] = it.next();
        }
        return ans;

    }
}
