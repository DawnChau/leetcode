package from.ant;

import java.util.HashSet;
import java.util.Set;

public class Pro_2657 {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] ans = new int[A.length];
        Set<Integer> tempA = new HashSet<>();
        Set<Integer> tempB = new HashSet<>();
        int cnt = 0;
        for (int i = 0; i < A.length; i++) {
            tempA.add(A[i]);
            tempB.add(B[i]);
            if (tempA.contains(B[i])) {
                cnt++;
            }
            if (tempB.contains(A[i])) {
                cnt++;
            }
            if (A[i] == B[i]) {
                cnt++;
            }
            ans[i] = cnt;
        }
        return ans;
    }
}
