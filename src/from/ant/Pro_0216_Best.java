package from.ant;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Pro_0216_Best {

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        LinkedList<Integer> path = new LinkedList<>();
        int sum = 0;
        backTracing(ans, k, n, path, 1, sum);
        return ans;
    }

    private void backTracing(List<List<Integer>> ans, int k, int n, LinkedList<Integer> path, int startIndex, int sum) {
        if (path.size() == k) {
            if (sum == n) {
                ans.add(new ArrayList<>(path));
            }
            return;
        }

        for (int i = startIndex; i <= 9; i++) {
            if (sum + i > n) {
                continue;
            }
            sum += i;
            path.add(i);
            backTracing(ans, k, n, path, i + 1, sum);
            sum-=i;
            path.removeLast();
        }
    }
}
