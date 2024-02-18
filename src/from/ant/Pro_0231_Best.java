package from.ant;

public class Pro_0231_Best {
    public boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        }
        int count = 2;
        for (int i = 1; i < 31; i++) {
            if (count == n) {
                return true;
            }
            if (count > n) {
                return false;
            }
            count *= 2;
        }
        return false;
    }
}
