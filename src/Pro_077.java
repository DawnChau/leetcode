import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 组合
 */
public class Pro_077 {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if (n <= 0 || k <= 0 || k > n) {
            return res;
        }

        List<Integer> c = new ArrayList<>();
        generate(n, k, 1, c, res);
        return res;
    }

    private void generate(int n, int k, int start, List<Integer> c, List<List<Integer>> res) {
        if (c.size() == k) {
            // ArrayList的拷贝
            List<Integer> temp = Arrays.asList(new Integer[c.size()]);
            Collections.copy(temp, c);
            res.add(temp);
            return;
        }

        // 剪枝
        // 还有 k - c.size 个空位
        // i 最多为 n-(k-c.size)+1
        for (int i = start; i <= n - (k - c.size()) + 1; i++) {
            c.add(i);
            generate(n, k, i + 1, c, res);
            // 回溯
            c.remove((Integer) i);
        }
    }

}
