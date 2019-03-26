/**
 * 求最后一个单词的长度
 */
public class Pro_058 {
    public int lengthOfLastWord(String s) {
        if (s.length() == 0)
            return 0;
        String[] strings = s.split("\\s+");
        if (strings.length == 0)
            return 0;
        return strings[strings.length - 1].length();
    }
}
