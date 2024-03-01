package from.ant;

public class Mianshi_0102_Best {

    public boolean CheckPermutation(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }
        int[] ch = new int[26];
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        for (int i = 0; i < ch1.length; i++) {
            ch[ch1[i]-'a']++;
        }
        for (int i = 0; i < ch2.length; i++) {
            ch[ch2[i]-'a']--;
            if (ch[ch2[i]-'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
