/**
 * 逆转字符串，要求空间是o(1)
 * 原地逆序
 */
public class Pro_344 {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;
        while(left<right){
            char temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
        }
    }
}
