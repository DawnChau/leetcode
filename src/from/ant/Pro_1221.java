package from.ant;

public class Pro_1221 {

    public int balancedStringSplit(String s) {
        int lCount = 0;
        int rCount = 0;
        int ans = 0;
        for (int i = 0; i < s.toCharArray().length; i++) {
            if (s.charAt(i) == 'R') {
                rCount++;
            } else {
                lCount++;
            }
            if(lCount == rCount){
                ans++;
            }
        }
        return ans;
    }
}
