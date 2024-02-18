package from.ant;

import java.util.ArrayList;
import java.util.List;

public class Pro_0093 {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int dotCount = 0;
        backTracing(s, res, sb, 0, 0);
        return res;
    }

    private void backTracing(String s, List<String> res, StringBuilder sb, int startIndex, int dotCount) {
        // 如果已经4个点了，则返回除了第四个点之前的元素
        if (dotCount == 4) {
            if (sb.length() == s.length() + 4) {
                res.add(sb.substring(0, sb.length() - 1));
            }
            return;
        }


        // 最多往后截取三位
        for (int i = startIndex + 1; i <= s.length() && i <= startIndex + 3; i++) {
            // 截取[startIndex,i)
            String digits = s.substring(startIndex, i);

            // 判断是否是合法的ip地址，如果不是就直接剪枝了
            if (!isMatchIp(digits)) {
                return;
            }

            int digitSize = digits.length();
            sb.append(digits);
            sb.append('.');
            dotCount++;
            // 下一轮从i开始
            backTracing(s, res, sb, i, dotCount);
            dotCount--;
            sb.delete(sb.length() - digitSize - 1, sb.length());
        }
    }

    private boolean isMatchIp(String digits) {
        // 不能用有前导0
        if (digits.length() > 1 && digits.charAt(0) == '0') {
            return false;
        }
        int num = Integer.parseInt(digits);
        return num <= 255;
    }
}
