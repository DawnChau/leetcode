package from.ant;

public class Pro_3099_Best {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        String s = String.valueOf(x);

        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res += (s.charAt(i) - '0');
        }

        if (x % res == 0) {
            return res;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new Pro_3099_Best().sumOfTheDigitsOfHarshadNumber(18));
    }
}
