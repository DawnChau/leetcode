package from.ant;

public class MianShi_0101_Best {
    public boolean isUnique(String astr) {
        char[] ch = new char[26];
        for (int i = 0; i < astr.toCharArray().length; i++) {
            if (ch[astr.charAt(i) - 'a'] != 0) {
                return false;
            }
            ch[astr.charAt(i) - 'a']++;
        }
        return true;
    }
}
