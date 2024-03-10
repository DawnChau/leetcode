package from.ant;

import java.util.Stack;

public class Pro_0844 {
    public boolean backspaceCompare(String s, String t) {
        String newS = getNewString(s);
        String newT = getNewString(t);
        return newS.equals(newT);
    }

    private String getNewString(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.toCharArray().length; i++) {
            char c = s.charAt(i);
            if (c == '#') {
                if(!stack.isEmpty()){
                    stack.pop();
                }
            } else {
                stack.push(c);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()){
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.toString();
    }
}
