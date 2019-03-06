/**
 * 寻找最长子串，每个字符至少k个重复
 * 返回最长的长度
 */
public class Pro_395 {
    public int longestSubstring(String s, int k) {
        return longestSubstring(s, k, 0, s.length() - 1);
    }

    private int longestSubstring(String s, int k, int start, int end) {
        // 递归退出条件
        if (start > end)
            return 0;

        // 存每个字符出现的次数
        int[] count = new int[26];

        for (int i = start; i <= end; i++) {
            count[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            // 不满足条件
            if (count[i] > 0 && count[i] < k) {
                int pos = s.indexOf((char) (i + 'a'), start);
                return Math.max(longestSubstring(s, k, start, pos - 1), longestSubstring(s, k, pos + 1, end));
            }
        }
        return end - start + 1;

    }
}
