package from.ant;

public class Pro_0383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[27];
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        char[] ransomNoteCh = ransomNote.toCharArray();
        char[] magazineCh = magazine.toCharArray();
        for (int i = 0; i < magazineCh.length; i++) {
            count[magazineCh[i] - 'a']++;
        }

        for (int i = 0; i < ransomNoteCh.length; i++) {
            count[ransomNoteCh[i] - 'a']--;
            if (count[ransomNoteCh[i] - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Pro_0383().canConstruct("aa", "aab"));
    }
}
