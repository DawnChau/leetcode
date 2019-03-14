import java.util.HashMap;
import java.util.Iterator;

/**
 * 查找距离到相等的点的种类数
 */
public class Pro_447 {
    public int numberOfBoomerangs(int[][] points) {
        int res = 0;

        for (int i = 0; i < points.length; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < points.length; j++) {
                if (i != j) {
                    int dis = distance(points[i], points[j]);
                    map.put(dis, map.getOrDefault(dis, 0) + 1);
                }
            }
            Iterator<Integer> it = map.keySet().iterator();
            while (it.hasNext()) {
                int dis = it.next();
                int nums = map.get(dis);
                res += nums * (nums - 1);
            }

        }
        return res;
    }

    private int distance(int[] point, int[] point1) {
        return (int) (Math.pow((point[0] - point1[0]), 2) + Math.pow((point[1] - point1[1]), 2));
    }
}
