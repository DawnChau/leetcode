import java.util.Arrays;

/**
 * 两个字符串是否是由相同的字符构成的
 */
public class Pro_242 {
    public boolean isAnagram(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        return new String(a).equals(new String(b));
    }
}
