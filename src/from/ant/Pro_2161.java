package from.ant;

import java.util.ArrayList;
import java.util.List;

public class Pro_2161 {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] res = new int[nums.length];
        List<Integer> less = new ArrayList<>();
        List<Integer> more = new ArrayList<>();
        int equalCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                less.add(nums[i]);
            } else if (nums[i] > pivot) {
                more.add(nums[i]);
            } else {
                equalCount++;
            }
        }

        int index = 0;
        for (int i = 0; i < less.size(); i++) {
            res[index++] = less.get(i);
        }

        for (int i = 0; i < equalCount; i++) {
            res[index++] = pivot;
        }

        for (int i = 0; i < more.size(); i++) {
            res[index++] = more.get(i);
        }

        return res;
    }
}
