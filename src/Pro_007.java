/**
 * 逆转Integer
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
        if(res>Integer.MAX_VALUE || -1L*res<Integer.MIN_VALUE)
            return 0;
        return isNeg ? -1 * (int)res : (int)res;
    }
}
