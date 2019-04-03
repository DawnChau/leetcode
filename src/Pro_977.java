import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * 返回平方递增
 */
public class Pro_977 {
    public int[] sortedSquares(int[] A) {
        if (A == null || A.length == 0)
            return A;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            list.add(A[i] * A[i]);
        }
        Collections.sort(list);
        Iterator<Integer> it = list.iterator();
        int[] res = new int[list.size()];
        int index = 0;
        while (it.hasNext()) {
            res[index++] = it.next();
        }
        return res;
    }
}
