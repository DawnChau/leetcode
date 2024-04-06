package from.ant;

import java.util.ArrayList;
import java.util.List;

public class MianShi_0807 {
    public String[] permutation(String S) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        backTracing(S.toCharArray(), ans, sb, 0);
        return ans.toArray(new String[0]);
    }

    private void backTracing(char[] chars, List<String> ans, StringBuilder sb, int startIndex) {
        if (sb.length() == chars.length) {
            ans.add(sb.toString());
            return;
        }

        // 为第startIndex个位置选择
        for (int i = startIndex; i < chars.length; i++) {
            swapChar(chars, i, startIndex);
            // 把第i个换到第startIndex个位置上
            sb.append(chars[startIndex]);
            backTracing(chars, ans, sb, startIndex + 1);
            sb.replace(sb.length() - 1, sb.length(), "");
            swapChar(chars, i, startIndex);
        }
    }

    private void swapChar(char[] chars, int i, int startIndex) {
        if (i == startIndex) {
            return;
        }
        char c = chars[i];
        chars[i] = chars[startIndex];
        chars[startIndex] = c;
    }

    public static void main(String[] args) {
        System.out.println(new MianShi_0807().permutation("qwe"));
    }
}
