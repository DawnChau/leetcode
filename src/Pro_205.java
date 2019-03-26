import java.util.HashMap;
import java.util.HashSet;

public class Pro_205 {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;
        // s -> t
        HashMap<Character, Character> map = new HashMap<>();
        // 判读是否 t 中的字母已经被映射过
        HashSet<Character> visited = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            if (map.containsKey(cs)) {
                if (map.get(cs) != ct)
                    return false;
                else
                    continue;
            } else {
                map.put(cs, ct);
                if (visited.contains(ct))
                    return false;
                visited.add(ct);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        new Pro_205().isIsomorphic("egg", "add");
    }
}
