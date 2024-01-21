package from.ant;

import java.util.LinkedList;
import java.util.Queue;

public class Pro_0225_Best {


}


class MyStack {

    private Queue<Integer> queue1 = new LinkedList<>();
    private Queue<Integer> queue2 = new LinkedList<>();

    public MyStack() {

    }

    public void push(int x) {
        queue1.offer(x);
    }

    public int pop() {
        int size = queue1.size();
        while (size > 1) {
            queue2.offer(queue1.poll());
            size--;
        }
        int res = queue1.poll();
        // 交换queue1和queue2
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return res;
    }

    public int top() {
        int size = queue1.size();
        while (size > 1) {
            queue2.offer(queue1.poll());
            size--;
        }
        int res = queue1.poll();
        queue2.offer(res);
        // 交换queue1和queue2
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return res;
    }

    public boolean empty() {
        return queue1.isEmpty();
    }
}
