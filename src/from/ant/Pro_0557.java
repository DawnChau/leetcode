package from.ant;

public class Pro_0557 {

    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sb.append(myReverse(words[i]));
            if (i != words.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    private char[] myReverse(String word) {
        char[] ch = word.toCharArray();
        int left = 0;
        int right = ch.length - 1;
        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        return ch;
    }
}
