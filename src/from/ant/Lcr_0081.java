package from.ant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Lcr_0081 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        LinkedList<Integer> path = new LinkedList<>();
        backTracing(ans, path, 0, target, candidates, 0);
        return ans;
    }

    private void backTracing(List<List<Integer>> ans, LinkedList<Integer> path, int sum, int target, int[] candidates, int startIndex) {
        if (sum == target) {
            ans.add(new ArrayList<>(path));
        }

        for (int i = startIndex; i < candidates.length; i++) {
            if (sum + candidates[i] > target) {
                break;
            }
            path.addLast(candidates[i]);
            sum+=candidates[i];
            // 从i开始，下一层就不会选上一层之前的
            backTracing(ans, path, sum, target, candidates, i);
            sum-=candidates[i];
            path.removeLast();
        }
    }
}
