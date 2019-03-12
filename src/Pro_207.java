import java.util.LinkedList;


/**
 * 判断图是否是有环的
 */
public class Pro_207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] count = new int[numCourses];

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
            return false;
        int result = zeroSet.size();
        while (!zeroSet.isEmpty()) {
            int x = zeroSet.remove();
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
        // 判断是否所有的课程都在可执行集合中
        return result == numCourses;
    }

}
