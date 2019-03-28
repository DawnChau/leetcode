import java.util.HashSet;

/**
 * 判断有几个email
 */
public class Pro_929 {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        for (String s : emails) {
            StringBuilder sb = new StringBuilder();
            int index = s.indexOf('@');
            String before = s.substring(0, index);
            String after = s.substring(index);
            int addIndex = before.indexOf('+');
            if (addIndex != -1) {
                before = before.substring(0, addIndex);
            }
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < before.length(); i++) {
                char c = before.charAt(i);
                if (c == '.')
                    continue;
                res.append(c);
            }
            res.append(after);
            set.add(res.toString());
        }
        return set.size();
    }
}
