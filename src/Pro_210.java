import java.util.LinkedList;

/**
 * 拓扑排序
 */
public class Pro_210 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] count = new int[numCourses];
        int[] res = new int[numCourses];
        int index = 0;

        // 存放入度为0
        LinkedList<Integer> zeroSet = new LinkedList<>();

        for (int i = 0; i < prerequisites.length; i++) {
            // 入度不为0，有先修课程
            count[prerequisites[i][0]]++;
        }
        // 优先从入度为0的，也就是没有先修课程的开始
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 0)
                zeroSet.add(i);
        }
        // 没有入度为0的，则存在环
        if (zeroSet.size() == 0)
            return new int[0];
        int result = zeroSet.size();
        while (!zeroSet.isEmpty()) {
            int x = zeroSet.remove();
            res[index++] = x;
            for (int i = 0; i < prerequisites.length; i++) {
                if (prerequisites[i][1] == x) {
                    // 修掉了前置课程
                    count[prerequisites[i][0]]--;
                    if (count[prerequisites[i][0]] == 0) {
                        // 入度为0
                        zeroSet.add(prerequisites[i][0]);
                        result++;
                    }
                }
            }
        }
        if (result != numCourses)
            return new int[0];
        // 判断是否所有的课程都在可执行集合中
        return res;
    }
}
