package from.ant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Pro_0040 {

    @SuppressWarnings("Duplicates")
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        LinkedList<Integer> path = new LinkedList<>();
        Arrays.sort(candidates);
        int sum = 0;
        backTracing(candidates, target, sum, 0, ans, path);
        return ans;
    }

    private void backTracing(int[] candidates, int target, int sum, int startIndex, List<List<Integer>> ans, LinkedList<Integer> path) {
        if (sum == target) {
            ans.add(new LinkedList<>(path));
            return;
        }

        for (int i = startIndex; i < candidates.length; i++) {
            if (candidates[i] + sum > target) {
                break;
            }
            // 横向不能重复使用，这里用i>startIndex表明纵向的可以重复，横向的不能重复
            if (i > startIndex && candidates[i] == candidates[i - 1]) {
                continue;
            }
            sum += candidates[i];
            path.add(candidates[i]);
            // 纵向用i + 1来保证取过的就不再取了
            backTracing(candidates, target, sum, i + 1, ans, path);
            sum -= candidates[i];
            path.removeLast();
        }
    }
}
