package from.ant;

public class Pro_2520 {
    public int countDigits(int num) {
        int res = 0;
        String str = String.valueOf(num);
        for (int i = 0; i < str.toCharArray().length; i++) {
            if (num % (str.charAt(i) - '0') == 0) {
                res++;
            }
        }
        return res;
    }
}
