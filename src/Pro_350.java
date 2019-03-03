import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 求两个数组的交集
 */
public class Pro_350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();
        int indexA = 0;
        int indexB = 0;
        while (indexA < nums1.length && indexB < nums2.length) {
            if (nums1[indexA] == nums2[indexB]) {
                list.add(nums1[indexA]);
                indexA++;
                indexB++;
            } else if (nums1[indexA] < nums2[indexB]) {
                indexA++;
            } else {
                indexB++;
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
