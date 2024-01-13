package from.ant;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Pro_0797 {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        LinkedList<Integer> path = new LinkedList<>();
        path.add(0);
        dfs(graph, ans, path, 0);
        return ans;
    }

    private void dfs(int[][] graph, List<List<Integer>> ans, LinkedList<Integer> path, int startIndex) {
        if (startIndex == graph.length - 1) {
            ans.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < graph[startIndex].length; i++) {
            path.add(graph[startIndex][i]);
            dfs(graph, ans, path, graph[startIndex][i]);
            path.removeLast();
        }
    }
}
