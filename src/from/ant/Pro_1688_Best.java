package from.ant;

public class Pro_1688_Best {
    public int numberOfMatches(int n) {
        int ans = 0;
        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
                ans += n;
            } else {
                n = (n - 1) / 2;
                ans += n;
                n++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new Pro_1688_Best().numberOfMatches(7));
    }
}
