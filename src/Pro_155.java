import java.util.Stack;

public class Pro_155 {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    /** initialize your data structure here. */
    public void MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if(minStack.isEmpty() || (!minStack.isEmpty() && minStack.peek()>=x)){
            minStack.push(x);
        }
    }

    public void pop() {
        int x = stack.pop();
        if(minStack.peek()==x){
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
