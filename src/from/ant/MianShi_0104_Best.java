package from.ant;

import java.util.HashSet;
import java.util.Set;

public class MianShi_0104_Best {
    public boolean canPermutePalindrome(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            // 如果已经存在重复的，则add会返回false，此时删除
            if (!set.add(c)) {
                set.remove(c);
            }
        }
        // 奇数和偶数场景
        return set.size() == 1 || set.size() == 0;
    }
}
