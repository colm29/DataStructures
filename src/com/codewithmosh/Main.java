package com.codewithmosh;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String s = "(1 + 2))";
        Expression ex = new Expression();
        System.out.println(ex.isBalanced(s));
    }
}
