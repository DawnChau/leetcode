package from.ant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pro_0890 {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (isMatch(words[i], pattern)) {
                res.add(words[i]);
            }
        }
        return res;
    }

    private boolean isMatch(String word, String pattern) {
        if (word.length() != pattern.length()) {
            return false;
        }
        Map<Character, Character> mapping = new HashMap<>();
        Map<Character, Character> reverseMapping = new HashMap<>();
        char[] ch = word.toCharArray();
        char[] pa = pattern.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (mapping.containsKey(ch[i]) || reverseMapping.containsKey(pa[i])) {
                if (mapping.get(ch[i]) == null || mapping.get(ch[i]) != pa[i]) {
                    return false;
                }
            } else {
                mapping.put(ch[i], pa[i]);
                reverseMapping.put(pa[i], ch[i]);
            }
        }
        return true;
    }
}
