package from.ant;

public class Pro_0541 {

    public String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
        for (int i = 0; i < s.length(); i += k * 2) {
            // 剩下的还够2K，翻转前K个
            if (i + k * 2 - 1 < s.length()) {
                reverse(ch, i, i + k - 1);

            } else {
                // 剩下的不足2K

                // 剩下的还有k个，翻转这k个
                if (i + k - 1 < s.length()) {
                    reverse(ch, i, i + k - 1);
                } else {

                    // 剩下的少于k，全部翻转
                    reverse(ch, i, s.length() - 1);
                }
            }
        }
        return new String(ch);
    }

    private void reverse(char[] ch, int start, int end) {
        while (start < end) {
            mySwap(ch, start, end);
            start++;
            end--;
        }
    }

    private void mySwap(char[] ch, int start, int end) {
        char temp = ch[start];
        ch[start] = ch[end];
        ch[end] = temp;
    }

}
