package from.ant;

public class Pro_02697 {

    public String makeSmallestPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] ch = s.toCharArray();
        while (left < right) {
            char c = ch[left];
            char d = ch[right];
            if(c != d){
                char min = (char) Math.min(c, d);
                ch[left] = min;
                ch[right] = min;
            }
            left++;
            right--;
        }
        return new String(ch);
    }
}
