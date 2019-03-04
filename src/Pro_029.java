/**
 * 不用除法实现两个数相除
 */
public class Pro_029 {
    public static int divide(int dividend, int divisor) {
        boolean positive = true;
        if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0))
            positive = false;
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            dividend = Integer.MIN_VALUE + 1;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        if (dividend == divisor)
            return positive ? 1 : -1;
        if (divisor == 1)
            return positive ? dividend : -1 * dividend;

        int res = 0;
        int count = 0;
        int originDivisor = divisor;
        while (dividend > divisor) {
            divisor <<= 1;
            count++;
            if (divisor > dividend) {
                divisor >>= 1;
                count--;
                dividend = dividend - divisor;
                divisor = originDivisor;
                res += Math.pow(2, count);
                count = 0;
            }
        }
        return positive ? res : -1 * res;
    }

    public static void main(String[] args) {
        System.out.println(divide(-2147483648, -1));
    }
}
