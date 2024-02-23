package from.ant;

public class Pro_0684 {
    private int[] father = new int[1005];

    private void init() {
        for (int i = 0; i < father.length; i++) {
            father[i] = i;
        }
    }

    private int find(int n) {
        return father[n] == n ? n : (father[n] = find(father[n]));
    }

    private boolean isSame(int n, int m) {
        int fatherN = find(n);
        int fatherM = find(m);
        return fatherM == fatherN;
    }

    private void join(int n, int m) {
        if (isSame(n, m)) {
            return;
        }
        // 合并要合并其祖先
        father[find(m)] = find(n);
    }

    public int[] findRedundantConnection(int[][] edges) {
        init();
        for (int i = 0; i < edges.length; i++) {
            if (isSame(edges[i][0], edges[i][1])) {
                // 已经连通了，再连就成环了
                return edges[i];
            } else {
                join(edges[i][0], edges[i][1]);
            }
        }
        return new int[]{};
    }
}

