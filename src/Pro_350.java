import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 求两个数组的交集
 * 查找表——map
 */
public class Pro_350 {
    public int[] intersect(int[] nums1, int[] nums2) {
//        Arrays.sort(nums1);
//        Arrays.sort(nums2);
//        List<Integer> list = new ArrayList<>();
//        int indexA = 0;
//        int indexB = 0;
//        while (indexA < nums1.length && indexB < nums2.length) {
//            if (nums1[indexA] == nums2[indexB]) {
//                list.add(nums1[indexA]);
//                indexA++;
//                indexB++;
//            } else if (nums1[indexA] < nums2[indexB]) {
//                indexA++;
//            } else {
//                indexB++;
//            }
//        }
//        int[] res = new int[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            res[i] = list.get(i);
//        }
//        return res;


        // 方法二，使用map来做
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i])) {
                res.add(nums2[i]);
                if (map.get(nums2[i]) == 1)
                    map.remove(nums2[i]);
                else
                    map.put(nums2[i], map.get(nums2[i]) - 1);
            }
        }

        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }
        return ans;
    }
}
