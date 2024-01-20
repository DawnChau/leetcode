package from.ant;

public class Pro_0344_Best {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left <= right) {
            mySwap(s, left++, right--);
        }
    }

    private void mySwap(char[] s, int left, int right) {
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
    }
}
