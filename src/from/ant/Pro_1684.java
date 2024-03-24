package from.ant;

public class Pro_1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        char[] set = new char[26];
        for (char c : allowed.toCharArray()) {
            set[c - 'a']++;
        }
        int res = 0;
        for (String word : words) {
            boolean allow = true;
            for (char c : word.toCharArray()) {
                if (set[c - 'a'] == 0) {
                    allow = false;
                    continue;
                }
            }
            if(allow){
                res++;
            }
        }
        return res;
    }
}
