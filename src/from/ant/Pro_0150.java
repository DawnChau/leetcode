package from.ant;

import java.util.Stack;

public class Pro_0150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+")) {
                int first = stack.pop();
                int second = stack.pop();
                stack.push(first + second);
            } else if (token.equals("-")) {
                int first = stack.pop();
                int second = stack.pop();
                stack.push(second - first);
            } else if (token.equals("*")) {
                int first = stack.pop();
                int second = stack.pop();
                stack.push(second * first);
            } else if (token.equals("/")) {
                int first = stack.pop();
                int second = stack.pop();
                stack.push(second / first);
            } else {
                stack.push(Integer.valueOf(token));
            }
        }
        return stack.peek();
    }
}
