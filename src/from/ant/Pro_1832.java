package from.ant;

import java.util.HashSet;

public class Pro_1832 {
    public boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < sentence.toCharArray().length; i++) {
            if (!set.contains(sentence.charAt(i))) {
                set.add(sentence.charAt(i));
            }
            // 还有多少字符 < 还差多少够26个字母
            if (sentence.length() - i - 1 < 26 - set.size()) {
                return false;
            }
        }
        return set.size() == 26;
    }
}
