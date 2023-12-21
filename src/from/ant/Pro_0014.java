package from.ant;

/**
 * 最长公共前缀
 */
public class Pro_0014 {

    public String longestCommonPrefix(String[] strs) {
        String s = strs[0];
        String res = "";

        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            sb.append(c);
            for (String str : strs) {
                if (!str.startsWith(sb.toString())) {
                    return sb.toString().substring(0, sb.length() - 1);
                }
            }
            res = sb.toString();
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Pro_0014().longestCommonPrefix(new String[]{"a"}));
    }
}
