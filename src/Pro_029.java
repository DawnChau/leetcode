/**
 * 不用除法实现两个数相除
 */
public class Pro_029 {
    public static int divide(int dividend, int divisor) {
        // 记录正负
        boolean positive = true;

        // 扩展为long
        long longDivisor = divisor;
        long longDividend = dividend;

        // 特殊情况处理
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        // 正负判断
        if ((longDividend < 0 && longDivisor > 0) || (longDividend > 0 && longDivisor < 0))
            positive = false;

        // 全部取正
        longDividend = Math.abs(longDividend);
        longDivisor = Math.abs(longDivisor);

        // 相等及除数是1的判断
        if (longDividend == longDivisor)
            return positive ? 1 : -1;
        if (longDivisor == 1)
            return positive ? dividend : -1 * dividend;

        int res = 0;
        int count = 0;
        long originDivisor = longDivisor;
        while (longDividend > longDivisor) {
            // 除数每次乘以2
            longDivisor <<= 1;
            // 记录幂数
            count++;
            if (longDivisor > longDividend) {
                // 超过了，回退一下
                longDivisor >>= 1;
                count--;
                // 剩余的差重新作为被除数
                longDividend = longDividend - longDivisor;
                // 除数恢复成最初的
                longDivisor = originDivisor;
                res += Math.pow(2, count);
                count = 0;
            } else if (longDividend == longDivisor) {
                // 恰好相等直接返回
                res += Math.pow(2, count);
                break;
            }
        }
        return positive ? res : -1 * res;
    }

    public static void main(String[] args) {
        System.out.println(divide(-2147483648, 2));
    }
}
