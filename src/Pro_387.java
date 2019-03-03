import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 寻找第一个只出现一次的字符
 */
public class Pro_387 {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                list.remove(map.get(s.charAt(i)));
            } else {
                map.put(s.charAt(i), i);
                list.add(i);
            }
        }
        return list.size() == 0 ? -1 : list.get(0);
    }
}
