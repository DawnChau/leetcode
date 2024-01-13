package from.ant;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Pro_0039 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        LinkedList<Integer> path = new LinkedList<>();
        int sum = 0;
        backTracing(candidates, target, ans, path, sum, 0);
        return ans;
    }

    private void backTracing(int[] candidates, int target, List<List<Integer>> ans, LinkedList<Integer> path, int sum, int startIndex) {
        if (sum == target) {
            ans.add(new ArrayList<>(path));
        }

        for (int i = startIndex; i < candidates.length; i++) {
            if (sum + candidates[i] > target) {
                continue;
            }
            sum += candidates[i];
            path.add(candidates[i]);
            // 这个地方传i，是因为纵向下一层还能继续多次使用i，但是横线的却不能使用原来的值了
            backTracing(candidates, target, ans, path, sum, i);
            sum -= candidates[i];
            path.removeLast();
        }
    }
}
