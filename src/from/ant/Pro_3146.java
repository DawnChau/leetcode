package from.ant;

public class Pro_3146 {
    public int findPermutationDifference(String s, String t) {
        int[] tIndex = new int[26];
        for (int i = 0; i < t.length(); i++) {
            tIndex[t.charAt(i) - 'a'] = i;
        }
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res += Math.abs(i - tIndex[s.charAt(i) - 'a']);
        }
        return res;
    }
}
