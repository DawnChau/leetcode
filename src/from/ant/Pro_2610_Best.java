package from.ant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pro_2610_Best {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] map = new int[nums.length + 1];
        Arrays.fill(map, 0);
        for (int i = 0; i < nums.length; i++) {
            if (ans.size() < map[nums[i]] + 1) {
                List<Integer> temp = new ArrayList<>();
                temp.add(nums[i]);
                ans.add(temp);
            } else {
                ans.get(map[nums[i]]).add(nums[i]);
            }
            map[nums[i]]++;
        }
        return ans;
    }
}
