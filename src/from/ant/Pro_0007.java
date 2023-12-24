package from.ant;

public class Pro_0007 {
    public int reverse(int x) {

        if (x == 0) {
            return 0;
        }

        boolean positive = (x >= 0);
        boolean leadingZero = true;

        String res = "";
        String reverseRes = "";

        StringBuilder sb = new StringBuilder(String.valueOf(x));
        if (sb.toString().charAt(0) == '-') {
            res = sb.toString().substring(1);
        } else {
            res = sb.toString();
        }


        for (int i = res.length() - 1; i >= 0; i--) {
            char c = res.charAt(i);

            // 前导0跳过
            if (c != '0') {
                leadingZero = false;
            }

            if (c == '0' && leadingZero) {
                continue;
            }

            reverseRes += c;
        }

        if (positive && isLargerThan(reverseRes, "2147483647")) {
            return 0;
        }

        if (!positive && isLargerThan(reverseRes, "2147483648")) {
            return 0;
        }

        return positive ? Integer.valueOf(reverseRes) : -1 * Integer.valueOf(reverseRes);
    }

    private boolean isLargerThan(String a, String b) {
        if (a.length() > b.length()) {
            return true;
        }

        if (a.length() < b.length()) {
            return false;
        }

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) > b.charAt(i)) {
                return true;
            }

            if (a.charAt(i) < b.charAt(i)) {
                return false;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        System.out.println(new Pro_0007().reverse(-2147483412));
    }
}
