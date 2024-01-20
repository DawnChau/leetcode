package from.ant;

import java.util.*;

public class Pro_0349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> num1 = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        for (int i : nums1) {
            num1.add(i);
        }
        for (int i : nums2) {
            if(num1.contains(i)){
                res.add(i);
            }
        }

        int[] ans = new int[res.size()];
        int index = 0;
        for (Integer re : res) {
            ans[index++] = re;
        }
        return ans;
    }
}
