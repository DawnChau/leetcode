/**
 * 判断字符串是否是回文的
 */
public class Pro_125 {
    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            sb.append(Character.isDigit(s.charAt(i)) || Character.isAlphabetic(s.charAt(i))?s.charAt(i):"");
        }
        String origin = sb.toString().toLowerCase();
        String reverse = sb.reverse().toString().toLowerCase();
        return reverse.equals(origin);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }
}
