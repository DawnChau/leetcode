package from.ant;

public class Pro_1828_Best {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] res = new int[queries.length];
        // 玄学，sum提到for循环外边，性能就提高了2ms？
        int sum = 0;
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int x = query[0];
            int y = query[1];
            int r = query[2];
            for (int[] point : points) {
                // 这个地方优化一下，用中间变量存储计算结果，不要放到if里每次都计算，可以提高1ms性能
                int dx = point[0] - x;
                int dy = point[1] - y;
                if (dx * dx + dy * dy <= r * r) {
                    sum++;
                }
            }
            res[i] = sum;
            sum = 0;
        }
        return res;
    }
}
