package from.ant;

import java.util.HashSet;
import java.util.Set;

/**
 * 最长没有重复数字的子串
 * 滑动窗口法
 */
public class Pro_0003 {
    public int lengthOfLongestSubstring(String s) {

        int first = 0;
        int last = 0;
        int longest = 0;
        int size = 0;
        Set<Character> set = new HashSet<>();

        while (first <= last && last < s.length()) {

            char c = s.charAt(last);
            if (!set.contains(c)) {
                set.add(c);
                last++;
                size++;
                longest = Math.max(size, longest);
            } else {
                set.remove(s.charAt(first));
                first++;
                size--;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        System.out.println(new Pro_0003().lengthOfLongestSubstring(" "));
    }
}
