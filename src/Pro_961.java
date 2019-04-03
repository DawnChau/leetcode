import java.util.HashSet;

/**
 * 找出重复了N次的数
 */
public class Pro_961 {
    public int repeatedNTimes(int[] A) {
        if (A == null || A.length == 0)
            return 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (set.contains(A[i]))
                return A[i];
            set.add(A[i]);
        }
        return 0;
    }
}
