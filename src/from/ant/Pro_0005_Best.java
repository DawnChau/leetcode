package from.ant;

/**
 * 时间最优：中心扩散法
 */
public class Pro_0005_Best {

    public String longestPalindrome(String s) {
        int maxLength = Integer.MIN_VALUE;
        char[] ch = s.toCharArray();
        int maxLeftIndex = 0;
        for (int i = 0; i < ch.length; i++) {
            // 奇数
            int[] res = findPalindromLength(ch, i, i);
            if (res[0] > maxLength) {
                maxLength = res[0];
                maxLeftIndex = res[1];
            }

            res = findPalindromLength(ch, i, i + 1);
            if (res[0] > maxLength) {
                maxLength = res[0];
                maxLeftIndex = res[1];
            }

        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < maxLength; i++) {
            sb.append(ch[maxLeftIndex + i]);
        }
        return sb.toString();
    }

    /**
     * 0位置是长度，1位置是left索引
     *
     * @param ch
     * @param left
     * @param right
     * @return
     */
    private int[] findPalindromLength(char[] ch, int left, int right) {
        int[] res = new int[2];
        while (left >= 0 && right < ch.length) {
            if (ch[left] == ch[right]) {
                left--;
                right++;
            } else {
                break;
            }
        }
        res[0] = right - left - 1;
        res[1] = left + 1;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Pro_0005_Best().longestPalindrome("abc"));
    }

}
