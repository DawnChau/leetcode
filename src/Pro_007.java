/**
 * 逆转Integer
 *
 * 2023年12月24日评论：
 * 假设环境不允许存储 64 位整数（有符号或无符号），不是说不能用long吗？这个不是很好的解法
 */
public class Pro_007 {
    public int reverse(int x) {
        if (x == 0)
            return 0;
        boolean isNeg = x < 0 ? true : false;
        x = Math.abs(x);
        long res = 0;
        while (x > 0) {
            int val = x % 10;
            res = res * 10 + val;
            x /= 10;
        }
        if (res > Integer.MAX_VALUE || -1L * res < Integer.MIN_VALUE)
            return 0;
        return isNeg ? -1 * (int) res : (int) res;
    }
}
