package from.ant;

import java.util.Objects;

/**
 * 最长回文子串
 */
public class Pro_0005 {

    public String longestPalindrome(String s) {

        String res = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() - 1; j >= i; j--) {
                if (isPalindrom(s, i, j)) {
                    String temp = s.substring(i, j + 1);
                    if (temp.length() > res.length()) {
                        res = temp;
                    }
                    break;
                }
            }
        }

        return res;
    }

    public boolean isPalindrom(String s, int startIndex, int endIndex) {
        while (startIndex < endIndex) {

            if (!Objects.equals(s.charAt(startIndex), s.charAt(endIndex))) {
                return false;
            }

            startIndex++;
            endIndex--;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Pro_0005().longestPalindrome("cbbd"));
    }
}
