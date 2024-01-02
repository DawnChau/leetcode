package from.ant;

import java.util.ArrayList;
import java.util.List;

public class Pro_2942_Best {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> res = new ArrayList<>();
        int left = 0;
        int right = words.length - 1;
        while (left <= right) {
            if (left == right) {
                if (containsStr(words[left], x)) {
                    res.add(left);
                }
                break;
            }

            if (containsStr(words[left], x)) {
                res.add(left);
            }
            if (containsStr(words[right], x)) {
                res.add(right);
            }
            left++;
            right--;
        }
        return res;
    }

    private boolean containsStr(String word, char x) {
        return word.indexOf(x) != -1;
    }
}
