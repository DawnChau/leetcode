import java.util.HashSet;

/**
 * 判断有几个不同的莫尔斯
 */
public class Pro_804 {
    public int uniqueMorseRepresentations(String[] words) {
        String[] letters = {
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
        };
        HashSet<String> set = new HashSet<>();
        for (String s : words) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                sb.append(letters[c - 'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
