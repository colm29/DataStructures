package com.codewithmosh;

import java.util.Stack;

public class Expression {
    public boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(')
                stack.push(ch);
            else if (ch == ')') {
                if (stack.empty())
                        return false;
                else
                    stack.pop();
            }
            }
        return  stack.empty();

    }
}
