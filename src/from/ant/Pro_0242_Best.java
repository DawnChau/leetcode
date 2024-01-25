package from.ant;

public class Pro_0242_Best {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();

        int[] chars = new int[26];
        for (char c : sCharArray) {
            chars[c - 'a']++;
        }
        for (char c : tCharArray) {
            chars[c - 'a']--;
            if (chars[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
