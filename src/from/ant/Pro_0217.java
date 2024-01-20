package from.ant;

import java.util.HashSet;
import java.util.Set;

public class Pro_0217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
