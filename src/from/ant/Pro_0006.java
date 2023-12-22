package from.ant;

/**
 * N 字形变换
 */
public class Pro_0006 {
    public String convert(String s, int numRows) {

        // 只有1行，直接返回
        if (numRows == 1) {
            return s;
        }

        String[] subRes = new String[numRows];
        for (int i = 0; i < subRes.length; i++) {
            subRes[i] = "";
        }

        int cur = 0;
        int index = 0;
        int plusIndex = numRows - 1;
        int decreaseIndex = 0;
        boolean plus = true;
        while (cur < s.length()) {
            subRes[index] += s.charAt(cur);
            cur++;

            // 往下走
            if (plus && (index <= plusIndex)) {
                if (index == plusIndex) {
                    // 该往上走了
                    plus = false;
                    index--;
                } else {
                    // 否则继续往下走
                    index++;
                }
            } else {
                // 往上走
                if (index == decreaseIndex) {
                    // 该往下走了
                    plus = true;
                    index++;
                } else {
                    index--;
                }
            }
        }

        String res = "";
        for (String s1 : subRes) {
            res += s1;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Pro_0006().convert("PAYPALISHIRING", 4));
    }
}
