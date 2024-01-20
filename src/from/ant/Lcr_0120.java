package from.ant;

import java.util.HashSet;
import java.util.Set;

public class Lcr_0120 {
    public int findRepeatDocument(int[] documents) {
        Set<Integer> set = new HashSet<>();
        for (int document : documents) {
            if (set.contains(document)) {
                return document;
            } else {
                set.add(document);
            }
        }
        return -1;
    }
}
