package from.ant;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pro_1557 {

    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        Set<Integer> ans = new HashSet<>();
        for (int i = 0; i < n ; i++) {
            ans.add(i);
        }
        for (int i = 0; i < edges.size(); i++) {
            List<Integer> edge = edges.get(i);
            ans.remove(edge.get(1));
        }
        return new ArrayList<>(ans);
    }
}
