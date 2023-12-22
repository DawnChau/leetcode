package from.ant;

import java.util.Stack;

/**
 * 括号匹配问题
 */
public class Pro_0020 {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            Character c = s.charAt(i);

            if (stack.isEmpty()) {
                stack.push(c);
                continue;
            }

            Character stackTop = stack.peek();

            if (needPop(c, stackTop)) {
                stack.pop();
                continue;
            }

            stack.push(c);
        }

        return stack.isEmpty();
    }

    private boolean needPop(Character c, Character stackTop) {
        if (c == '}' && stackTop == '{') {
            return true;
        }

        if (c == ')' && stackTop == '(') {
            return true;
        }

        if (c == ']' && stackTop == '[') {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(new Pro_0020().isValid("(]"));
    }
}
