import java.util.Arrays;

/**
 * 分饼干，贪心
 */
public class Pro_455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int gLength = g.length;
        int sLength = s.length;

        int gIndex = gLength - 1;
        int sIndex = sLength - 1;
        int res = 0;
        while (gIndex >= 0 && sIndex >= 0) {
            // 满足
            if (s[sIndex] >= g[gIndex]) {
                res++;
                sIndex--;
                gIndex--;
            } else {
                gIndex--;
            }
        }
        return res;
    }
}
