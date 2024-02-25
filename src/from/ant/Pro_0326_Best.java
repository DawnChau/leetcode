package from.ant;

import java.util.HashSet;
import java.util.Set;

public class Pro_0326_Best {

    // 耗时最优
    public boolean isPowerOfThree(int n) {
        return n > 0 && ((int) Math.pow(3, 19)) % n == 0;
    }

    // 不是最优解
    public boolean isPowerOfThree1(int n) {
        Set<Integer> powerOfThree = init();
        return powerOfThree.contains(n);
    }

    private Set<Integer> init() {
        Set<Integer> set = new HashSet<>();
        for (long i = 1; i <= Integer.MAX_VALUE; i *= 3) {
            set.add(new Long(i).intValue());
        }
        return set;
    }
}
