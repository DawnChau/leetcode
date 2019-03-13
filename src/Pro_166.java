import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Pro_166 {
    public String fractionToDecimal(int numerator, int denominator) {
        // 存是否是循环，val是index
        HashMap<Long, Integer> map = new HashMap<>();
        // 存数
        List<Long> list = new ArrayList<>();
        int index = 0;
        int beginIndex = -1;

        StringBuilder sb = new StringBuilder();
        if (denominator == 0)
            return "";
        long num = numerator;
        long denom = denominator;
        if ((num < 0 && denom > 0) || (num > 0 && denom < 0))
            sb.append('-');

        num = Math.abs(num);
        denom = Math.abs(denom);

        // 小数点前的部分
        long val = num / denom;
        sb.append(String.valueOf(val));
        num = (num % denom) * 10;

        // 小数点后的部分
        while (num != 0) {
            if (map.containsKey(num)) {
                // 确定重复的起始位置，并退出循环
                beginIndex = map.get(num);
                break;
            } else {
                // 将数存到list中
                map.put(num, index++);
                val = num / denom;
                num = (num % denom) * 10;
                list.add(val);
            }
        }

        // 构造res字符串
        for (int i = 0; i < index; i++) {
            if (i == 0)
                sb.append('.');
            if (i == beginIndex)
                sb.append('(');
            sb.append(list.get(i));
        }
        if (beginIndex != -1)
            sb.append(")");
        return sb.toString();
    }
}
