/**
 * 找相同字符
 */
public class Pro_771 {
    public int numJewelsInStones(String J, String S) {
        int res = 0;
        for (int i = 0; i < J.length(); i++) {
            char m = J.charAt(i);
            for (int j = 0; j < S.length(); j++) {
                char n = S.charAt(j);
                if (m == n)
                    res++;
            }
        }
        return res;
    }
}
