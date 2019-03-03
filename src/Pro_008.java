import java.math.BigDecimal;

/**
 * 字符串转换为整数
 */
public class Pro_008 {
    public static int myAtoi(String str) {
        // 字符串消除前后空白
        str = str.trim();

        // 空字符串直接返回
        if (str.length() == 0)
            return 0;

        // 判断是否是符号位
        if (str.charAt(0) == '-') {
            str = str.substring(1); //去掉
            return strToInteger(str, false);
        } else if (str.charAt(0) == '+') {
            str = str.substring(1); // 去掉
            return strToInteger(str, true);
        } else if (Character.isDigit(str.charAt(0))) {
            // 如果不是符号位
            return strToInteger(str, true);
        }
        return 0;
    }

    public static int strToInteger(String str, boolean positive) {
        StringBuilder sb = new StringBuilder();
        // 必须使用BigDecimal才能接收
        BigDecimal res = new BigDecimal(0);

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i)))
                break;
            sb.append(str.charAt(i));
        }
        if (sb.length() != 0)
            res = new BigDecimal(sb.toString());
        if (!positive)
            res = res.multiply(new BigDecimal(-1));
        if (res.compareTo(new BigDecimal(Integer.MAX_VALUE)) > 0)
            return Integer.MAX_VALUE;
        if (res.compareTo(new BigDecimal(Integer.MIN_VALUE)) < 0)
            return Integer.MIN_VALUE;
        return res.intValue();
    }

    public static void main(String[] args) {
        System.out.println(myAtoi(" -42"));
    }
}
