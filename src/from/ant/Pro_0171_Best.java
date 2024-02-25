package from.ant;

public class Pro_0171_Best {
    public int titleToNumber(String columnTitle) {
        char[] ch = columnTitle.toCharArray();
        int res = 0;
        for (int i = 0; i < ch.length; i++) {
            res *= 26;
            res += (ch[i] - 'A' + 1);
        }
        return res;
    }
}
