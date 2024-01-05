package from.ant;

import java.util.Stack;

public class Pro_0155 {

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());

    }
}

class MinStack {

    private Stack<Integer> numStack;
    private Stack<Integer> minStack;


    public MinStack() {
        numStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        numStack.push(val);

        if (minStack.isEmpty()) {
            minStack.push(val);
        } else {
            minStack.push(Math.min(minStack.peek(), val));
        }
    }

    public void pop() {
        numStack.pop();
        minStack.pop();
    }

    public int top() {
        return numStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
