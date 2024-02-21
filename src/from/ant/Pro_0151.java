package from.ant;

public class Pro_0151 {
    public String reverseWords(String s) {
        String[] strings = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            sb.append(strings[strings.length - 1 - i]);
            if (i != strings.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Pro_0151().reverseWords("  hello world  "));
    }
}
