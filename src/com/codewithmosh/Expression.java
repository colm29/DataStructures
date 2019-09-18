package com.codewithmosh;

import java.util.Stack;

public class Expression {
    public boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '<' || ch == '[' || ch == '{')
                stack.push(ch);
            else if (ch == ')' || ch == '>' || ch == ']') {
                if (stack.empty()) return false;
                var top = stack.pop();
                if ((top == '(' && ch != ')') || (top == '<' && ch != '>') || (top == '[' && ch != ']') || (top == '{' && ch != '}'))  return false;
            }
            }
        return  stack.empty();

    }
}
