package from.ant;

import java.util.HashMap;
import java.util.Map;

public class Pro_2744 {
    public int maximumNumberOfStringPairs(String[] words) {
        int res = 0;
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (map.containsKey(words[i])) {
                res++;
                map.remove(words[i]);
            } else {
                map.put(new StringBuilder(words[i]).reverse().toString(), words[i]);
            }
        }
        return res;
    }
}
