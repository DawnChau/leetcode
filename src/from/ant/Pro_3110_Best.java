package from.ant;

public class Pro_3110_Best {
    public int scoreOfString(String s) {
        int ans = 0;
        int len = s.length();
        for (int i = 0; i < len - 1; i++) {
            ans += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }
        return ans;
    }
}
