package from.ant;

import java.util.Stack;

public class Pro_0232_Best {
}

class MyQueue {

    private Stack<Integer> inputStack = new Stack<>();
    private Stack<Integer> outputStack = new Stack<>();

    public MyQueue() {

    }

    public void push(int x) {
        inputStack.push(x);
    }

    public int pop() {
        dumpToOutPutStackIfNecessary();
        return outputStack.pop();
    }

    private void dumpToOutPutStackIfNecessary() {
        if(outputStack.isEmpty()){
            while (!inputStack.isEmpty()){
                outputStack.push(inputStack.pop());
            }
        }
    }

    public int peek() {
        dumpToOutPutStackIfNecessary();
        return outputStack.peek();
    }

    public boolean empty() {
        return inputStack.isEmpty() && outputStack.isEmpty();
    }
}
