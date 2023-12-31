package from.ant;

public class Pro_0008_Best {
    public int myAtoi(String s) {
        char[] ch = s.toCharArray();
        boolean positive = true;
        // 默认不需要计算
        boolean needCount = false;
        long res = 0;
        for (int i = 0; i < ch.length; i++) {
            // 前导空格和前导0被去掉
            if ((ch[i] == ' ') && !needCount) {
                continue;
            }
            // 下一个要开始算了
            if (ch[i] == '-' && !needCount) {
                positive = false;
                needCount = true;
                continue;
            }
            if (ch[i] == '+' && !needCount) {
                needCount = true;
                continue;
            }

            if (Character.isDigit(ch[i])) {
                if (!needCount) {
                    needCount = true;
                }
                res = res * 10 + (ch[i] - '0');
                if (exceedLimit(res, positive)) {
                    return getExceedLimitRes(positive);
                }
            } else {
                // 读到非数字结束
                break;
            }
        }
        return positive ? (int) res : (int) (-1 * res);
    }

    private int getExceedLimitRes(boolean positive) {
        if (positive) {
            return Integer.MAX_VALUE;
        }
        return Integer.MIN_VALUE;
    }

    private boolean exceedLimit(long res, boolean positive) {
        if (positive) {
            return res > Integer.MAX_VALUE;
        }
        return (res * -1) < Integer.MIN_VALUE;
    }
}
