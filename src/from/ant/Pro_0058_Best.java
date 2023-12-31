package from.ant;

public class Pro_0058_Best {

    public int lengthOfLastWord(String s) {
        char[] ch = s.toCharArray();
        boolean needCount = false;
        int count = 0;
        for (int i = ch.length - 1; i >= 0; i--) {
            if (ch[i] == ' ') {
                if (needCount) {
                    return count;
                }
            } else {
                if (!needCount) {
                    needCount = true;
                }
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Pro_0058_Best().lengthOfLastWord("luffy is still joyboy"));
    }
}
