package from.ant;

import java.util.HashSet;
import java.util.Set;

public class Pro_0771 {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < jewels.toCharArray().length; i++) {
            set.add(jewels.charAt(i));
        }
        int count = 0;
        for (char c : stones.toCharArray()) {
            if(set.contains(c)){
                count++;
            }
        }
        return count;
    }
}
