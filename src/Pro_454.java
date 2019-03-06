import java.util.HashMap;
import java.util.Map;

/**
 * 给定四个长度相同的数组，在每个数组中取一个数字，在所有的组合中和为零的组合有多少个？
 * 思路，分成两两
 */
public class Pro_454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                int sum = C[i] + D[j];
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }

        int res = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                int sum = C[i] + D[j];
                res += map.getOrDefault(-1 * (A[i] + B[j]), 0);
            }
        }
        return res;
    }
}
