package from.ant;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Pro_0078_Best {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<Integer> path = new LinkedList<>();
        backTracing(nums, res, 0, path);
        return res;
    }

    private void backTracing(int[] nums, List<List<Integer>> res, int startIndex, LinkedList<Integer> path) {
        if (startIndex == nums.length + 1) {
            return;
        }

        // 路径上的每个节点都需要加入进去
        res.add(new ArrayList<>(path));

        for (int i = startIndex; i < nums.length; i++) {
            path.add(nums[i]);
            backTracing(nums, res, i + 1, path);
            path.removeLast();
        }

    }
}
