package from.ant;

import java.util.ArrayList;
import java.util.List;

public class Pro_0022_Best {
    public List<String> generateParenthesis(int n) {
        // 左括号数量小于等于右括号数量时候，只能生成左括号。
        // 左括号数量大于右括号数量，可以生成左括号，也可以生成右括号
        List<String> ans = new ArrayList<>();
        int leftCount = 0;
        int rightCount = 0;
        StringBuilder sb = new StringBuilder();
        generateParenthesis(ans, sb, n, leftCount, rightCount);
        return ans;
    }

    private void generateParenthesis(List<String> ans, StringBuilder sb, int n, int leftCount, int rightCount) {
        // 当左括号数量和右括号数量都等于n时候，递归结束
        if (leftCount == n && rightCount == n) {
            ans.add(sb.toString());
            return;
        }

        if (leftCount <= rightCount) {
            // 只能生成左括号
            sb.append("(");
            generateParenthesis(ans, sb, n, leftCount + 1, rightCount);
            sb.deleteCharAt(sb.length() - 1);
        } else {

            // 生成左括号
            // 如果左括号还未生成满，生成左括号
            if (leftCount < n) {
                sb.append("(");
                generateParenthesis(ans, sb, n, leftCount + 1, rightCount);
                sb.deleteCharAt(sb.length() - 1);
            }

            // 生成右括号
            sb.append(")");
            generateParenthesis(ans, sb, n, leftCount, rightCount + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
