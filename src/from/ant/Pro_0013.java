package from.ant;

/**
 * 罗马数字转整数
 */
public class Pro_0013 {
    public int romanToInt(String s) {

        int res = 0;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == 'I') {
                if (i + 1 < s.length()) {
                    char next = s.charAt(i + 1);
                    if (next == 'V' || next == 'X') {
                        res -= 1;
                        continue;
                    }
                }
                res += 1;
            } else if (c == 'V') {
                res += 5;
            } else if (c == 'X') {
                if (i + 1 < s.length()) {
                    char next = s.charAt(i + 1);
                    if (next == 'L' || next == 'C') {
                        res -= 10;
                        continue;
                    }
                }
                res += 10;
            } else if (c == 'L') {
                res += 50;
            } else if (c == 'C') {
                if (i + 1 < s.length()) {
                    char next = s.charAt(i + 1);
                    if (next == 'D' || next == 'M') {
                        res -= 100;
                        continue;
                    }
                }
                res += 100;
            } else if (c == 'D') {
                res += 500;
            } else if (c == 'M') {
                res += 1000;
            }

        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Pro_0013().romanToInt("MCMXCIV"));
    }
}
