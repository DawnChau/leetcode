package from.ant;

/**
 * 寻找第一次出现needle时候的索引
 */
public class Pro_0028_Best {
    public int strStr(String a, String b) {
        if (b.length() > a.length()) {
            return -1;
        }
        char[] aCh = a.toCharArray();
        char[] bCh = b.toCharArray();
        int bStartChar = bCh[0];
        for (int i = 0; i < a.length(); i++) {
            if (aCh[i] != bStartChar) {
                continue;
            }
            boolean contain = true;
            for (int j = 0; j < b.length(); j++) {
                if (i + j >= a.length() || aCh[i + j] != bCh[j]) {
                    contain = false;
                    break;
                }
            }
            if (contain) {
                return i;
            }
        }
        return -1;
    }
}
