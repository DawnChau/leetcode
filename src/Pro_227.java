import java.util.Stack;

/**
 * 计算器
 * 用栈来解决
 */
public class Pro_227 {
    public static int calculate(String s) {
        if (s == null || s.length() == 0)
            return 0;
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        // 预先放一个操作数，很巧妙，防止遇到乘除时候弹出的操作数不是实际要乘除的操作数
        char op = '+';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            }
            if ((!Character.isDigit(c) && c != ' ') || i == s.length() - 1) {
                // 不是数字或者遍历到字符串的最后一个
                switch (op) {
                    case '+':
                        stack.push(num);
                        break;
                    case '-':
                        stack.push(-num);
                        break;
                    case '*':
                        stack.push(stack.pop() * num);
                        break;
                    case '/':
                        stack.push(stack.pop() / num);
                }
                op = c;
                num = 0;
            }
        }
        int res = 0;
        while (!stack.isEmpty()) {
            res += stack.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(calculate("3/2 "));
    }
}
