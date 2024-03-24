package from.ant;

public class Pro_2315 {
    public int countAsterisks(String s) {

        int lineCount = 0;
        boolean calc = true;
        int ans = 0;
        for (int i = 0; i < s.toCharArray().length; i++) {
            if (s.charAt(i) == '|') {
                lineCount++;
                if (lineCount % 2 == 1) {
                    calc = false;
                } else {
                    calc = true;
                }
            }
            if (calc && s.charAt(i) == '*') {
                ans++;
            }
        }
        return ans;
    }
}
