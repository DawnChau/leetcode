/**
 * 快速幂实现自己的pow函数（最好的方法）
 * 除二取余
 */
public class Pro_050 {
    public double myPow(double x, int n) {
        if (n == 0)
            return 1.0;
        double ans = 1.0;
        for (int i = n; i != 0; i /= 2) {
            // 有余数，算上
            if (i % 2 != 0)
                ans *= x;
            x *= x;
        }
        if (n < 0)
            return 1 / ans;
        else
            return ans;
    }
}
