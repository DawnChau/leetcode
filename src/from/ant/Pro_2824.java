package from.ant;

import java.util.List;

public class Pro_2824 {
    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
        for (int i = 1; i < nums.size(); i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (nums.get(i) + nums.get(j) < target) {
                    count++;
                }
            }
        }
        return count;
    }
}
