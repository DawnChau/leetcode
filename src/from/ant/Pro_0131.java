package from.ant;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Pro_0131 {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        LinkedList<String> path = new LinkedList<>();
        backTracing(s, res, path, 0);
        return res;
    }

    private void backTracing(String s, List<List<String>> res, LinkedList<String> path, int startIndex) {
        if (startIndex == s.length()) {
            res.add(new ArrayList<>(path));
            return;
        }

        // 横向，从起始位置开始1个，开始2个，开始3个，开始4个
        for (int i = startIndex; i < s.length(); i++) {
            // 截取startIndex到第i个字符
            String sub = s.substring(startIndex, i + 1);
            // 如果是回文串，加入
            if (isHuiwen(sub)) {
                path.add(sub);
                // 纵向，起始位置从0，从i+1
                backTracing(s, res, path, i + 1);
                path.removeLast();
            }
        }
    }

    private boolean isHuiwen(String sub) {
        int startIndex = 0;
        int endIndex = sub.length() - 1;
        while (startIndex <= endIndex) {
            if (sub.charAt(startIndex) != sub.charAt(endIndex)) {
                return false;
            }
            startIndex++;
            endIndex--;
        }
        return true;
    }
}
