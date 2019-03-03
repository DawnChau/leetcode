/**
 * 求最长回文子串
 */
public class Pro_005 {
    private static int maxLength;
    private static int start;
    public static String longestPalindrome(String s) {
        if(s.length()==1 || s.length()==0)
            return s;
        // 默认最长回文串的长度是1
        maxLength = 0;
        start = 0;
        for(int i = 0;i<s.length();i++){
            // 奇数
            solve(s,i,i);
            // 偶数
            solve(s,i,i+1);
        }
        return s.substring(start,start+maxLength);

    }

    public static void solve(String s,int left,int right){
        while(left>=0 && right<s.length() && (s.charAt(left)==s.charAt(right))){
            left--;
            right++;
        }
        // right-left-1 的解释，此刻left和right不应该被算进去
        if(maxLength<right-left-1){
            start = left+1;
            maxLength = right-left-1;
        }
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("bb"));
    }
}
