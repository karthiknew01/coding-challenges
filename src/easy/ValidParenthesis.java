package easy;

import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        char lastChar = '0';
        for (char c : s.toCharArray()) {
            if ((lastChar == '(' && c == ')') || (lastChar == '{' && c == '}') || (lastChar == '[' && c == ']')) {
                stack.pop();
            } else {
                stack.push(c);
            }

            lastChar = (stack.isEmpty()) ? '0' : stack.peek();
        }

        return stack.isEmpty();
    }


}
