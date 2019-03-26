import java.util.ArrayList;
import java.util.List;

/**
 * 分回文串
 */
public class Pro_131 {
    private List<List<String>> res = new ArrayList<>();

    public List<List<String>> partition(String s) {
        dfs(s, new ArrayList<String>());
        return res;
    }

    private void dfs(String s, ArrayList<String> list) {
        // 如果传入的字符串长度为0，则DFS到头
        if (s.length() < 1) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 1; i <= s.length(); i++) {
            String str = s.substring(0, i);
            if (isPalindrom(str)) {
                list.add(str);
                dfs(s.substring(i), list);
                // 回溯
                list.remove(list.size() - 1);
            }
        }
    }

    /**
     * 判断是否回文
     *
     * @param str
     * @return
     */
    private boolean isPalindrom(String str) {
        int p1 = 0;
        int p2 = str.length() - 1;
        while (p1 <= p2) {
            if (str.charAt(p1++) != str.charAt(p2--))
                return false;
        }
        return true;
    }
}
