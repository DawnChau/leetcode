package from.ant;

import java.util.Objects;

public class Pro_0009 {

    public boolean isPalindrome(int x) {

        String s = String.valueOf(x);
        return Objects.equals(s, reverseStr(s));
    }

    private String reverseStr(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Pro_0009().isPalindrome(10));
    }
}
