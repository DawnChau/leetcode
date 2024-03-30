package from.ant;

import java.util.ArrayList;
import java.util.List;

public class MianShi_0809 {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        backTracing(n, ans, sb, 0, 0);
        return ans;
    }

    private void backTracing(int n, List<String> ans, StringBuilder sb, int leftCount, int rightCount) {
        if (leftCount == n && rightCount == n) {
            ans.add(sb.toString());
            return;
        }

        if (leftCount <= rightCount) {
            sb.append('(');
            backTracing(n, ans, sb, leftCount + 1, rightCount);
            sb.replace(sb.length() - 1, sb.length(), "");
        } else {

            if (leftCount < n) {
                sb.append('(');
                backTracing(n, ans, sb, leftCount + 1, rightCount);
                sb.replace(sb.length() - 1, sb.length(), "");
            }

            if (rightCount < leftCount) {
                sb.append(')');
                backTracing(n, ans, sb, leftCount, rightCount + 1);
                sb.replace(sb.length() - 1, sb.length(), "");
            }
        }
    }
}
