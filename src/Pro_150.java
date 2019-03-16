import java.util.Stack;


/**
 * 逆波兰表达式
 */
public class Pro_150 {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            char c = tokens[i].charAt(tokens[i].length() - 1);
            if (Character.isDigit(c)) {
                Integer num = Integer.valueOf(tokens[i]);
                stack.push(num);
            } else {
                switch (c) {
                    case '+':
                        stack.push(stack.pop() + stack.pop());
                        break;
                    case '-':
                        int temp = stack.pop();
                        stack.push(stack.pop() - temp);
                        break;
                    case '*':
                        stack.push(stack.pop() * stack.pop());
                        break;
                    case '/':
                        int tmp = stack.pop();
                        stack.push(stack.pop() / tmp);
                        break;
                    default:
                        continue;
                }
            }
        }
        return stack.pop();
    }


    public static void main(String[] args) {
        String[] tokens = {"1", "2", "+", "3", "*"};
        evalRPN(tokens);
    }
}
