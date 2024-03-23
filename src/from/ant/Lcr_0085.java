package from.ant;

import java.util.ArrayList;
import java.util.List;

public class Lcr_0085 {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        backTracing(n, ans, 0, 0, sb);
        return ans;
    }

    private void backTracing(int n, List<String> ans, int leftCount, int rightCount, StringBuilder sb) {
        if (leftCount == n && rightCount == n) {
            ans.add(sb.toString());
            return;
        }

        // 只能添加左括号
        if (leftCount == rightCount) {
            sb.append("(");
            backTracing(n, ans, leftCount + 1, rightCount, sb);
            sb.replace(sb.length() - 1, sb.length(), "");
        } else if (leftCount > rightCount) {

            if (leftCount < n) {
                // 添加左括号
                sb.append("(");
                backTracing(n, ans, leftCount + 1, rightCount, sb);
                sb.replace(sb.length() - 1, sb.length(), "");
            }


            // 添加右括号
            sb.append(")");
            backTracing(n, ans, leftCount, rightCount + 1, sb);
            sb.replace(sb.length() - 1, sb.length(), "");
        }

    }

    public static void main(String[] args) {
        System.out.println(new Lcr_0085().generateParenthesis(3));
    }
}
