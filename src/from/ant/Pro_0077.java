package from.ant;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 组合；回溯
 */
public class Pro_0077 {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<Integer> temp = new LinkedList<>();
        backTracing(n, k, res, temp, 1);
        return res;
    }

    private void backTracing(int n, int k, List<List<Integer>> res, LinkedList<Integer> temp, int startIndex) {
        // 回溯中止
        if (temp.size() == k) {
            res.add(new ArrayList<>(temp));
            return;
        }

        // 剪枝
        for (int i = startIndex; i <= n && i <= n - k + temp.size() + 1; i++) {
            temp.add(i);
            backTracing(n, k, res, temp, i + 1);
            temp.removeLast();
        }
    }
}
