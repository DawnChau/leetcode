package from.ant;

import java.util.HashMap;
import java.util.Map;

public class Pro_2325 {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> code = new HashMap<>();
        char cur = 'a';
        for (char c : key.toCharArray()) {
            if (c == ' ') {
                continue;
            }
            if (!code.containsKey(c)) {
                code.put(c, cur++);
            }
        }
        StringBuilder ans = new StringBuilder();
        for (char c : message.toCharArray()) {
            if (c == ' ') {
                ans.append(c);
                continue;
            }
            ans.append(code.get(c));
        }
        return ans.toString();
    }
}
