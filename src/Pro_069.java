/**
 * 求一个数的开方
 */
public class Pro_069 {
    public int mySqrt(int x) {
        for (long i = 1; ; i++) {
            long m = i * i;
            long n = (i + 1) * (i + 1);
            if (x >= m && x < n)
                return (int) i;
        }
    }
}
