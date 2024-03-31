package from.ant;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MianShi_0804 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        LinkedList<Integer> path = new LinkedList<>();
        backTracing(nums, ans, path, 0);
        return ans;
    }

    private void backTracing(int[] nums, List<List<Integer>> ans, LinkedList<Integer> path, int startIndex) {
        // 每添加一个元素，都要算是一种
        ans.add(new ArrayList<>(path));

        for (int i = startIndex; i < nums.length; i++) {
            path.addLast(nums[i]);
            backTracing(nums, ans, path, i + 1);
            path.removeLast();
        }

    }
}
