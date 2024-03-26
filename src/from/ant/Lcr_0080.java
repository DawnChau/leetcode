package from.ant;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lcr_0080 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        LinkedList<Integer> path = new LinkedList<>();
        backTracing(n, k, 1, ans, path);
        return ans;
    }

    private void backTracing(int n, int k, int startIndex, List<List<Integer>> ans, LinkedList<Integer> path) {
        if (path.size() == k) {
            ans.add(new ArrayList<>(path));
            return;
        }

        for (int i = startIndex; i <= n; i++) {
            path.addLast(i);
            backTracing(n, k, i + 1, ans, path);
            path.removeLast();
        }
    }
}
