package from.ant;

/**
 * 二分法
 */
public class Pro_0069 {
    public int mySqrt(int x) {
        //Math.sqrt(Integer.MAX_VALUE) > 46340
        if (x > 2147395600) {
            return 46340;
        }
        int left = 0;
        int right = 46340;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int res = mid * mid;
            if (res == x) {
                return mid;
            }
            if (left == right) {
                return left - 1;
            }
            if (res < x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        System.out.println(46340 * 46340);
    }


}
