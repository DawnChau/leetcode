package from.ant;

import java.util.Arrays;

public class Pro_0455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int start = g.length - 1;
        int count = 0;
        // 大尺寸优先满足大胃口
        for (int i = s.length - 1; i >= 0; i--) {
            while (start >= 0) {
                if (g[start] <= s[i]) {
                    start--;
                    count++;
                    break;
                } else {
                    start--;
                }
            }
        }
        return count;
    }
}
