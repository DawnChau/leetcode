package from.ant;

public class Pro_0367_Best {

    public boolean isPerfectSquare(int num) {
        // 46341 * 46341 > Integer.MAX_VALUE
        int left = 1;
        int right = 46340;
        while (left <= right) {
            if (left == right) {
                return num == left * left;
            }
            int mid = (left + right) / 2;
            int temp = mid * mid;
            if (num == temp) {
                return true;
            } else if (num > temp) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

}
