import java.util.HashMap;
import java.util.Map;

/**
 * 罗马数字转整数
 */
public class Pro_013 {
    public int romanToInt(String s) {
        if(s.length()==0)
            return 0;
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        char pre = s.charAt(0);
        int res = 0;
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.get(pre)<map.get(c)) {
                res -= 2 * map.get(pre);
            }
            res+=map.get(c);
            pre = c;
        }
        return res;
    }
}
