package from.ant;

import java.util.LinkedList;
import java.util.Queue;

public class Lcr_0125 {

}

class CQueue {

    private Queue<Integer> queue;

    public CQueue() {
        queue = new LinkedList<>();
    }

    public void appendTail(int value) {
        queue.offer(value);
    }

    public int deleteHead() {
        if (queue.size() == 0) {
            return -1;
        }
        return queue.poll();
    }
}
