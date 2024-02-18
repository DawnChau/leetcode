package from.ant;

import java.util.PriorityQueue;

public class Lcr_0159 {
    public int[] inventoryManagement(int[] stock, int cnt) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < stock.length; i++) {
            queue.add(stock[i]);
        }

        int[] res = new int[cnt];

        for (int i = 0; i < cnt; i++) {
            res[i] = queue.poll();
        }
        return res;
    }
}
