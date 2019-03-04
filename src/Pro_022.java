import java.util.ArrayList;
import java.util.List;

/**
 * 产生括号
 */
public class Pro_022 {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        // 递归退出条件
        if (n == 0) {
            res.add("");
            return res;
        }

        // 这里很关键，只能选择【0，n-1】，因为会手动加上一个，并且0是递归退出条件
        // 核心思想是括号内和括号外的都是合理的括号
        for (int i = 0; i < n; i++) {
            List<String> first = generateParenthesis(i);
            List<String> second = generateParenthesis(n - i - 1);
            for (String x : first) {
                for (String y : second) {
                    StringBuilder sb = new StringBuilder();
                    res.add(sb.append("(").append(x).append(")").append(y).toString());
                }
            }
        }
        return res;
    }
}
