/**
 * 字符串解析为大写字母的方法
 * 约束版的爬楼梯
 * 如果和前一个数不能组成10到26之间的数字时候，则不能爬两层
 */
public class Pro_091 {
    public int numDecodings(String s) {
        if (s.length() == 0)
            return 0;
        int[] dp = new int[3];
        if (s.charAt(0) != '0')
            dp[0] = 1;
        else
            dp[0] = 0;
        for (int i = 1; i < s.length(); i++) {
            dp[i % 3] = 0;
            // 0的话，如果只考虑0，则不会转化为任何字母
            if (s.charAt(i) != '0')
                dp[i % 3] = dp[(i - 1) % 3];
            int temp = (s.charAt(i) - '0') + (s.charAt(i - 1) - '0') * 10;
            if (temp >= 10 && temp <= 26) {
                if (i - 2 >= 0)
                    dp[i % 3] += dp[(i - 2) % 3];
                else
                    dp[i]++;
            }
        }
        int len = s.length() - 1;
        return dp[len % 3];
    }
}
