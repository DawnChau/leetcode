package from.ant;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lcr_0110 {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        LinkedList<Integer> path = new LinkedList<>();
        path.add(0);
        backTracing(graph, ans, path, 0);
        return ans;
    }

    private void backTracing(int[][] graph, List<List<Integer>> ans, LinkedList<Integer> path, int row) {

        if (row == graph.length - 1) {
            ans.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < graph[row].length; i++) {
            path.addLast(graph[row][i]);
            backTracing(graph, ans, path, graph[row][i]);
            path.removeLast();
        }
    }
}
