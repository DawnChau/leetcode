/**
 * excel 列号转换
 */
public class Pro_168 {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            sb.append((char) (((n - 1) % 26) + 'A'));
            n--;
            n /= 26;
        }
        return sb.reverse().toString();
    }
}
