package from.ant;

public class Pro_0387 {
    public int firstUniqChar(String s) {
        int[] charCounts = new int[26];
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            charCounts[ch[i] - 'a']++;
        }

        for (int i = 0; i < ch.length; i++) {
            if (charCounts[ch[i] - 'a'] == 1) {
                return i;
            }

        }
        return -1;
    }
}
