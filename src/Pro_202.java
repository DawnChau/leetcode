import java.util.HashSet;
import java.util.Set;

/**
 * 判断一个数是否是开心数
 */
public class Pro_202 {
    public boolean isHappy(int n) {
        if (n == 0)
            return false;
        int sum = 0;
        Set<Integer> set = new HashSet<>();
        while (n != 1) {
            while (n > 0) {
                int v = n % 10;
                sum += Math.pow(v, 2);
                n /= 10;
            }
            if (!set.add(sum))
                return false;

            n = sum;
            sum = 0;
        }
        return true;
    }
}
