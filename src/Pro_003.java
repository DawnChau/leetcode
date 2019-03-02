import java.util.HashSet;

/**
 * 最长没有重复数字的子串
 * 滑动窗口法
 */
public class Pro_003 {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int res = 0;
        HashSet<Character> set = new HashSet<>();
        while(start<s.length() && end < s.length()){
            if(set.contains(s.charAt(end))){
                // 窗口前边后移
                set.remove(s.charAt(start++));
            }else{
                // 加入，并且后移
                set.add(s.charAt(end++));
                res = Math.max(res,end-start);
            }
        }
        return res;
    }
}
