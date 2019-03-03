/**
 * 26进制转10进制
 */
public class Pro_171 {
    public static int titleToNumber(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isAlphabetic(c)) {
                ans = ans * 26 + c - 'A' + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("AB"));
    }
}
