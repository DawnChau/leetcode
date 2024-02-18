package from.ant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Pro_0090 {

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        LinkedList<Integer> path = new LinkedList<>();
        backTracing(nums, ans, path, 0);
        return ans;

    }

    private void backTracing(int[] nums, List<List<Integer>> ans, LinkedList<Integer> path, int startIndex) {
        ans.add(new ArrayList<>(path));

        // 横向去重
        for (int i = startIndex; i < nums.length; i++) {
            // 重复的话，往后移，选第一个
            if (i > startIndex && nums[i] == nums[i - 1]) {
                continue;
            }

            path.add(nums[i]);
            // 纵向不去重
            backTracing(nums, ans, path, i + 1);
            path.removeLast();

        }
    }
}
