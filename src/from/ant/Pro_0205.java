package from.ant;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Pro_0205 {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();

        // 记录t里的那些字符已经被s绑定了，就不能被s里的其他字符再绑定
        Set<Character> bounded = new HashSet<>();
        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (t.charAt(i) != map.get(s.charAt(i))) {
                    return false;
                }
            } else {
                if (bounded.contains(t.charAt(i))) {
                    return false;
                }
                map.put(s.charAt(i), t.charAt(i));
                bounded.add(t.charAt(i));
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Pro_0205().isIsomorphic("badc", "baba"));
    }
}
