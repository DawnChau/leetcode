package from.ant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Pro_1656 {
}

class OrderedStream {

    private String[] strings;

    private int id = 1;

    public OrderedStream(int n) {
        strings = new String[n];
        Arrays.fill(strings, null);
    }

    public List<String> insert(int idKey, String value) {
        strings[idKey - 1] = value;

        List<String> ans = new ArrayList<>();

        if (Objects.nonNull(strings[id - 1])) {
            for (int i = id - 1; i < strings.length; i++) {
                if (strings[i] == null) {
                    id = i + 1;
                    return ans;
                }
                ans.add(strings[i]);
            }
        }

        return ans;
    }
}